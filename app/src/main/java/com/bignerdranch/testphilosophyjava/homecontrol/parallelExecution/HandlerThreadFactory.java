package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.ThreadFactory;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class HandlerThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r){
        print(this+" creating new Thread");
        Thread t = new Thread(r);
        print("created "+t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        print("eh = "+t.getUncaughtExceptionHandler());
        return t;
    }
}
