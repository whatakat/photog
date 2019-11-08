package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.concurrent.CountDownLatch;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class WaitingTask implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;
    WaitingTask(CountDownLatch latch){
        this.latch = latch;
    }
    public void run(){
        try {
            latch.await();
            print("Latch barrier passed for "+this);
        }catch (InterruptedException ex){
            print(this+" interrupted");
        }
    }
    public String toString(){
        return String.format("WaitingTask %1$-3d ", id);
    }
}
