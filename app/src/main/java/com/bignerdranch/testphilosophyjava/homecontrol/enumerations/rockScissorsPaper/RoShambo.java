package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper;

import com.bignerdranch.testphilosophyjava.homecontrol.enumerations.Enums;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class RoShambo {
    public static <T extends Competitor<T>> void match(T a, T b){
        print(a+" vs. "+b+": "+a.compete(b));
    }
    public static <T extends Enum<T>&Competitor<T>> void play(Class<T> rsbClass, int size){
        for (int i = 0; i <size ; i++)
            match(Enums.random(rsbClass), Enums.random(rsbClass));
    }
}
