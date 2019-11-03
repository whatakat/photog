package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.TimeUnit;

import javassist.runtime.Inner;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class InnerRunnable1 {
    private int countDown = 5;
    private Inner inner;
    private class Inner implements Runnable{
        Thread t;
        Inner(String name){
            t = new Thread(this, name);
            t.start();
        }
        public void run(){
            try {
                while (true){
                    print(this);
                    if (--countDown ==0) return;
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            }catch (InterruptedException e){
                print("sleep() interrupted");
            }
        }
        public String toString(){
            return t.getName()+": "+countDown;
        }
    }
    public InnerRunnable1(String name){
         inner = new Inner(name);
    }
}
