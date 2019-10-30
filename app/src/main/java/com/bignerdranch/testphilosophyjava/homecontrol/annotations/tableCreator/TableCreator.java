package com.bignerdranch.testphilosophyjava.homecontrol.annotations.tableCreator;

import com.bignerdranch.testphilosophyjava.homecontrol.annotations.Constraints;
import com.bignerdranch.testphilosophyjava.homecontrol.annotations.DBTable;
import com.bignerdranch.testphilosophyjava.homecontrol.annotations.SQLInteger;
import com.bignerdranch.testphilosophyjava.homecontrol.annotations.SQLString;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class TableCreator {
    public static void main(String[] args) throws Exception {
        if (args.length<1){
            print("arguments: annotated classes");
            System.exit(0);
        }
        for (String className: args){
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null){
                print("No DBTable annotation in class "+className);
                continue;
            }
            String tableName = dbTable.name();
            if (tableName.length()<1)
                tableName = cl.getName().toUpperCase();
            List<String> columnDefs = new ArrayList<String>();
            for (Field field: cl.getDeclaredFields()){
                String colomnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length<1)
                    continue;
                if(anns[0] instanceof SQLInteger){
                    SQLInteger sInt = (SQLInteger) anns[0];
                    if (sInt.name().length()<1)
                        colomnName = field.getName().toUpperCase();
                    else
                        colomnName = sInt.name();
                    columnDefs.add(colomnName+" INT"+
                            getConstraints(sInt.constraints()));
                }
                if (anns[0] instanceof SQLString){
                    SQLString sString = (SQLString)anns[0];
                    if (sString.name().length()<1)
                        colomnName = field.getName().toUpperCase();
                    else
                        colomnName = sString.name();
                    columnDefs.add(colomnName+" VARCHAR("+
                            sString.value()+")"+
                            getConstraints(sString.constraints()));
                }
                StringBuilder createCommand = new StringBuilder(
                        "CREATE TABLE "+tableName+"(");
                for (String columnDef : columnDefs)
                    createCommand.append("\n    "+columnDef+",");
                String tableCreate = createCommand.substring(
                        0,createCommand.length()-1)+");";
                print("Table Creation SQL for "+
                        className+" is :\n"+tableCreate);
            }
        }
    }
    private static String getConstraints(Constraints con){
        String constraints = "";
        if (!con.allowNull())
            constraints+=" NOT NULL";
        if (con.primaryKey())
            constraints+=" PRIMARY KEY";
        if (con.unique())
            constraints+=" UNIQUE";
        return constraints;
    }
}
