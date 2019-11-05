package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.EvenChecker;
import com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.IntGenerator;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue =
            new AtomicInteger(0);
    public int next(){
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
