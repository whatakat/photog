package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class DualSynch {
    private Object syncObject = new Object();
    public synchronized void f(){
        for (int i = 0; i <5 ; i++) {
            print("f()");
            Thread.yield();
        }
    }
    public void g(){
        synchronized (syncObject){
            for (int i = 0; i <5 ; i++) {
                print("g()");
                Thread.yield();

            }
        }
    }
}
