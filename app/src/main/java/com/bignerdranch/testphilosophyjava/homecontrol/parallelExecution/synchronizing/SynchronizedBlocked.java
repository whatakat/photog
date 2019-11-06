package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SynchronizedBlocked implements Runnable {
    public synchronized void f(){
        while (true)
            Thread.yield();
    }
    public SynchronizedBlocked(){
        new Thread(){
            public void run(){
                f();
            }
        }.start();
    }
    public void run(){
        print("Trying to call f()");
        f();
        print("Exiting SynchronizedBlocked.run()");
    }
}
