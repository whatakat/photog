package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SimpleDeamons implements Runnable {
    public void run(){
        try {
            while (true){
                TimeUnit.MICROSECONDS.sleep(100);
                print(Thread.currentThread()+" "+this);
            }
        }catch (InterruptedException e){
            print("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i <10 ; i++) {
            Thread daemon = new Thread(new SimpleDeamons());
            daemon.setDaemon(true);
            daemon.start();
        }
        print("All daemons started");
        TimeUnit.MICROSECONDS.sleep(175);

    }
}
