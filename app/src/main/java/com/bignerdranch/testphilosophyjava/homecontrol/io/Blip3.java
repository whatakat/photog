package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Blip3 implements Externalizable {
    private int i;
    private String s;
    public Blip3(){
        print("Blip3 Constructor");
    }
    public Blip3(String x, int a){
        print("Blip3(String x, int a)");
        s=x;
        i=a;
    }
    public String toString(){return s+i;}
    public void writeExternal(ObjectOutput out) throws IOException{
        print("Blip3.writeExternal");
        out.writeObject(s);
        out.writeInt(i);
    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        print("Blip3.readExternal");
        s=(String) in.readObject();
        i= in.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        print("Constructing objects:");
        Blip3 b3=new Blip3("A String ", 47);
        print(b3);
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Blip3.out"));
        print("Saving object:");
        o.writeObject(b3);
        o.close();
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Blip3.out"));
        print("Recovering b3:");
        b3 = (Blip3)in.readObject();
        print(b3);
    }
}
