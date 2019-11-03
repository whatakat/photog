package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SleepingTask extends LiftOff {
    public void run(){
        try {
            while (countDown-- >0){
                print(status());
                TimeUnit.MICROSECONDS.sleep(100);
            }
        }catch (InterruptedException e){
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i <5 ; i++)
            exec.execute(new SleepingTask());
        exec.shutdown();
    }
}
