package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class FileOutputShortcut {
    static String file = "C:\\Geekbrains\\3.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("C:\\Geekbrains\\1.txt")));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine())!=null)
            out.println(lineCount++ + ": "+s);
        out.close();
        print(BufferedInputFile.read(file));

    }
}
