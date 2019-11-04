package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class ExceptionThread2 implements Runnable {
    public void run(){
        Thread t = Thread.currentThread();
        print("run() by "+t);
        print("eh = "+t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
