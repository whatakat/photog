package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class AtomicityTest implements Runnable {
    private int i = 0;
    public int getValue(){return i;}
    private synchronized void evenIncrement(){i++;i++;}
    public void run(){
        while (true)
            evenIncrement();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while (true){
            int val = at.getValue();
            if (val % 2 !=0){
                print(val);
                System.exit(0);
            }
        }
    }
}
