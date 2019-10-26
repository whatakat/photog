package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import com.bignerdranch.testphilosophyjava.homecontrol.generator.Generator;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        print(rg.next()+", ");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i <10 ; i++)
            printNext(cc);
    }
        }
