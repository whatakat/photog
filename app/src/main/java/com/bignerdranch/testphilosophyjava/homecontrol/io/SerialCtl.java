package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SerialCtl implements Serializable {
    private String a;
    private transient String b;
    public SerialCtl(String aa, String bb){
        a = "Not transient "+aa;
        b = "Transient "+bb;
    }
    public String toString(){return a + "\n"+b;}

    public void writeObject(ObjectOutputStream stream) throws IOException{
        stream.defaultWriteObject();
        stream.writeObject(b);
    }
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
        stream.defaultReadObject();
        b= (String) stream.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerialCtl sc = new SerialCtl("Test1","Test2");
        print("Before:\n"+sc);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(buf);
        o.writeObject(sc);
        ObjectInputStream in = new ObjectInputStream(
                new ByteArrayInputStream(buf.toByteArray()));
        try {
            SerialCtl sc2 = (SerialCtl)in.readObject();//why is it catch Exception????
            print("After:\n"+sc2);
        }catch (Exception e){
            print("Open block try - exception!");
        }


    }
}
