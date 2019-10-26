package com.bignerdranch.testphilosophyjava.homecontrol.io;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String passvord;
    public Logon(String name, String pwd){
        username = name;
        passvord = pwd;
    }
    public String toString(){
        return "logon info: \n username: "+username+
                "\n date: "+date+"\n password: "+passvord;
    }

    public static void main(String[] args) throws Exception {
        Logon a = new Logon("Hulk", "myLittlePony");
        print("logon a = "+a);
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Logon.out"));
        o.writeObject(a);
        o.close();
        TimeUnit.SECONDS.sleep(1);
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Logon.out"));
        print("Recovering object at "+new Date());
        a = (Logon)in.readObject();
        print("logon a = "+a);

    }
}
