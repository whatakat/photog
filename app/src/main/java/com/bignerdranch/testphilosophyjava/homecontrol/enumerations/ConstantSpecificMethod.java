package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import java.text.DateFormat;
import java.util.Date;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public enum ConstantSpecificMethod {
    DATE_TIME{
        String getInfo(){
            return
                    DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VERSION{
        String getInfo(){
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm: values())
            print(csm.getInfo());
    }
}
