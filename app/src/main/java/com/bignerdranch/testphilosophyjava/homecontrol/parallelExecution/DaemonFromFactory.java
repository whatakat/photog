package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class DaemonFromFactory implements Runnable {
    public void run(){
        try {
            while (true){
                TimeUnit.MICROSECONDS.sleep(100);
                print(Thread.currentThread()+" "+this);
            }
        }catch (InterruptedException e){
            print("Interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool(
                new DaemonThreadFactory());
        for (int i = 0; i <10 ; i++)
            exec.execute(new DaemonFromFactory());
        print("All daemons started");
        TimeUnit.MICROSECONDS.sleep(500);

    }
}
