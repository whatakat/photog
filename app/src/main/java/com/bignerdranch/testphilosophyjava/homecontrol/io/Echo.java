package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
                String s;

                while ((s = stdin.readLine()) != null && s.length() !=0) {
                    print(s.toUpperCase());
                }

    }
}
