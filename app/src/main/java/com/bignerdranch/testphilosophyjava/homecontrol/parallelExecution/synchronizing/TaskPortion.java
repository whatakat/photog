package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class TaskPortion implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private static Random rand = new Random(47);
    private final CountDownLatch latch;
    TaskPortion(CountDownLatch latch){
        this.latch = latch;
    }
    public void run(){
        try {
            doWork();
            latch.countDown();
        }catch (InterruptedException ex){

        }
    }
    public void doWork() throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(rand.nextInt(2000));
        print(this+"competed");
    }
    public String toString(){
        return String.format("%1$-3d ", id);
    }
}
