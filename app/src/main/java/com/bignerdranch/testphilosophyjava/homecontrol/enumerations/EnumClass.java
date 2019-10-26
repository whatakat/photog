package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s: Shrubbery.values()){
            print(s + " ordinal: "+s.ordinal());
            printnb(s.compareTo(Shrubbery.CRAWLING)+" ");
            printnb(s.equals(Shrubbery.CRAWLING)+" ");
            print(s==Shrubbery.CRAWLING);
            print(s.getDeclaringClass());
            print(s.name());
            print("------------------------");
        }
    }
}
