package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(BufferedInputFile.read(
                            "C:\\Geekbrains\\1.txt").getBytes()));
            while (true)
                printnb((char)in.readByte());
        }catch (EOFException e){
            System.err.println("End of stream");
        }

    }
}
