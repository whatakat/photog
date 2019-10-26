package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.File;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);
        for (File file : Directory.local(".","T.*"))
            print(file);
        print("----------------------");
        for (File file : Directory.walk(".","T.*\\.java"))
            print(file);
        print("======================");
        for (File file : Directory.walk(".",".*[Zz].*\\.class"))
            print(file);
    }
}
