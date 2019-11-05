package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

public class PairChecker implements Runnable {
    private PairManager pm;
    public PairChecker(PairManager pm){
        this.pm = pm;
    }
    public void run(){
        while (true){
            pm.checkCounter.incrementAndGet();
            pm.getPair().checkState();
        }
    }
}
