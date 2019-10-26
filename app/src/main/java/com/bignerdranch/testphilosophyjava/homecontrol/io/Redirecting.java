package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("C:\\geekbrains\\1.txt"));
        PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("C:\\geekbrains\\7.txt")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while ((s=br.readLine())!= null)
            print(s);
        out.close();
        System.setOut(console);

    }
}
