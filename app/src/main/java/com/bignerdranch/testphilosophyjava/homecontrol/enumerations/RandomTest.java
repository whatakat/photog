package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++)
            print(Enums.random(Activity.class)+" ");
    }
}
