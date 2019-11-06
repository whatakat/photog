package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SleepBlocked implements Runnable {
    public void run(){
        try {
            TimeUnit.SECONDS.sleep(100);
        }catch (InterruptedException e){
            print("InterruptedException");
        }
        print("Exiting SleepBlocked.run()");
    }
}
