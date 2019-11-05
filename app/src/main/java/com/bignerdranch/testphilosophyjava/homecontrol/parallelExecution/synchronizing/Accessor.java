package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Accessor implements Runnable {
    private final int id;
    public Accessor(int idn){id = idn;}
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            ThreadLocalVariableHolder.increment();
            print(this);
            Thread.yield();
        }
    }
    public String toString(){
        return "#"+id+": "+
                ThreadLocalVariableHolder.get();
    }
}
