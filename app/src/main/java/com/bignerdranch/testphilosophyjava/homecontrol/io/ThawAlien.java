package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(new File("C:\\geekbrains", "X.file")));
        Object mystery = in.readObject();
        print(mystery.getClass());

    }
}
