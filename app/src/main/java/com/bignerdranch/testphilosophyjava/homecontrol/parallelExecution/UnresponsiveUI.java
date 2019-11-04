package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

public class UnresponsiveUI {
    private volatile double d = 1;
    public UnresponsiveUI() throws Exception{
        while (d>0)
            d = d+(Math.PI +Math.E)/d;
        System.in.read();
    }
}
