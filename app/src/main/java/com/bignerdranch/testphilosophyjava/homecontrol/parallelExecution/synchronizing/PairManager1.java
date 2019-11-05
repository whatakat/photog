package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

public class PairManager1 extends PairManager {
    public synchronized void increment(){
        p.incrementX();
        p.incrementY();
        store(getPair());
    }
}
