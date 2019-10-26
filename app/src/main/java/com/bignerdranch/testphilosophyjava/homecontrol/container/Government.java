package com.bignerdranch.testphilosophyjava.homecontrol.container;

import com.bignerdranch.testphilosophyjava.homecontrol.generator.Generator;

public class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds "+
            "distributing sword is no basis for a system of "+
            "goverment").split(" ");
    private int index;
    public String next(){return foundation[index++];}
}
