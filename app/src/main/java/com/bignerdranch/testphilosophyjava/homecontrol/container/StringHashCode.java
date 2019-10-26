package com.bignerdranch.testphilosophyjava.homecontrol.container;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class StringHashCode {
    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        print(hellos[0].hashCode());
        print(hellos[1].hashCode());
    }
}
