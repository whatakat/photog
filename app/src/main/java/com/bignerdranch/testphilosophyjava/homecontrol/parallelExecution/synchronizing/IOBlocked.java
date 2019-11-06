package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.io.IOException;
import java.io.InputStream;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class IOBlocked implements Runnable {
    private InputStream in;
    public IOBlocked(InputStream is){in=is;}
    public void run(){
        try {
            print("Waiting for read():");
            in.read();
        }catch (IOException e){
            if (Thread.currentThread().isInterrupted()){
                print("Interrupted from blocked I/O");
            }else {
                throw new RuntimeException(e);
            }
        }
        print("Exiting IOBlocked.run()");
    }
}
