package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++)
            new Thread(new LiftOff()).start();
        print("Warning for LiftOff");
    }
}
