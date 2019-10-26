package com.bignerdranch.testphilosophyjava.homecontrol.io;

import com.bignerdranch.testphilosophyjava.homecontrol.test8.CountingGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class BufferedInputFile {
    public static String read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine())!= null)
            sb.append(s+"\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String[] s;
        String ss="";
        s=read("C:\\Geekbrains\\1.txt").split(" ");
        LinkedList<String> list = new LinkedList<String>();
        for (String str: s)
            list.add(str);
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious())
            ss+=it.previous()+" ";
        print(ss);
    }
}
