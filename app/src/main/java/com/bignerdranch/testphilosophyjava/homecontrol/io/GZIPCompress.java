package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class GZIPCompress {
    public static void main(String[] args) throws IOException {
        if (args.length==0){
            print("Usage: \nGZIPcompress file\n"+
                    "\tUses GZIP compression to compress "+
                    "the file to 1.txt");
            System.exit(1);
        }
        BufferedReader in = new BufferedReader(
                new FileReader(args[0]));
        BufferedOutputStream out = new BufferedOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream("C:\\Geekbrains\\1.txt")));
        print("Writing file");
        int c;
        while ((c = in.read())!=-1)
            out.write(c);
        in.close();
        out.close();
        print("Reading file");
        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(new GZIPInputStream(
                        new FileInputStream("C:\\Geekbrains\\1.txt"))));
        String s;
        while ((s = in2.readLine())!=null)
            print(s);

    }
}
