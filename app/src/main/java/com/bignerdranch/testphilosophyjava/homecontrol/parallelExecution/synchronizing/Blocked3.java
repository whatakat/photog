package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Blocked3 implements Runnable {
    private volatile double d = 0.0;
    public void run(){
        try {
            while (!Thread.interrupted()){
                NeedsCleanup n1 = new NeedsCleanup(1);
                try {
                    print("Sleeping");
                    TimeUnit.SECONDS.sleep(1);
                    NeedsCleanup n2 = new NeedsCleanup(2);
                    try {
                        print("Calculating");
                        for (int i = 1; i<2500000; i++)
                            d = d+(Math.PI+Math.E)/d;
                        print("Finished time-consuming operation");
                    }finally {
                        n2.cleanup();
                    }
                }finally {
                    n1.cleanup();
                }
            }
            print("Exiting via while() test");
        }catch (InterruptedException e){
            print("Exiting via InterruptedException");
        }
    }
}
