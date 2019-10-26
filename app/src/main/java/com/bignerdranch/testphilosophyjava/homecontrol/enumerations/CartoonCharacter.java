package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;


import com.bignerdranch.testphilosophyjava.homecontrol.generator.Generator;

import java.util.Random;

public enum CartoonCharacter implements Generator {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random rand = new Random(47);
    public CartoonCharacter next(){
        return values()[rand.nextInt(values().length)];
    }
}
