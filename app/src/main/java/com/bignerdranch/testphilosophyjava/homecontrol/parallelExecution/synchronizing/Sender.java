package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.io.IOException;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Sender implements Runnable {
    private Random rand = new Random(47);
    private PipedWriter out = new PipedWriter();
    public PipedWriter getPipedWriter(){return out;}
    public void run(){
        try {
            while (true)
                for (char c='A'; c<='z';c++){
                    out.write(c);
                    TimeUnit.MILLISECONDS.sleep(rand.nextInt(500));
                }
        }catch (IOException e){
            print(e+" Sender write exception");
        }catch (InterruptedException e){
            print(e+" Sender sleep interrupted");
        }
    }
}
