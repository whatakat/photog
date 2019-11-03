package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class InnerRunnable2 {
    private int countDown = 5;
    private Thread t;
    public InnerRunnable2(String name){
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true){
                        print(this);
                        if (--countDown==0) return;
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                }catch (InterruptedException e){
                    print("sleep() interrupted");
                }
            }
            public String toString(){
                return Thread.currentThread().getName()+
                        ": "+countDown;
            }
        },name);
        t.start();
    }
}
