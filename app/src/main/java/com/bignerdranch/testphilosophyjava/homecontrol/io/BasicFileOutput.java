package com.bignerdranch.testphilosophyjava.homecontrol.io;

import com.bignerdranch.testphilosophyjava.homecontrol.test8.CountingGenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class BasicFileOutput {
    static String file="C:\\Geekbrains\\2.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("C:\\Geekbrains\\1.txt")));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine())!= null)
            out.println(lineCount++ + ": "+s);
        out.close();
        print(BufferedInputFile.read(file));

    }
}
