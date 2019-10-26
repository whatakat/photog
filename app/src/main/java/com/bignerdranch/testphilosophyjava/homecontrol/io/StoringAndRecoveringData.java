package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("C:\\Geekbrains\\4.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("C:\\Geekbrains\\4.txt")));
        print(in.readDouble());
        print(in.readUTF());
        print(in.readDouble());
        print(in.readUTF());

    }
}
