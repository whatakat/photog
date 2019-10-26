package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class FreezAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("C:\\geekbrains\\X.file"));
        Alien quellek = new Alien();
        out.writeObject(quellek);

    }
}
