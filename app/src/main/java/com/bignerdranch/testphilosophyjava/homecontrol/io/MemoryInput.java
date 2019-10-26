package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.IOException;
import java.io.StringReader;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("C:\\Geekbrains\\1.txt"));
        int c;
        while ((c=in.read())!=-1)
            printnb((char)c);

    }
}
