package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Toaster implements Runnable {
    private ToastQueue toastQueue;
    private int count = 0;
    private Random rand = new Random(47);
    public Toaster(ToastQueue tq){toastQueue = tq;}
    public void run(){
        try {
            while (!Thread.interrupted()){
                TimeUnit.MILLISECONDS.sleep(
                        100+rand.nextInt(500));
                Toast t = new Toast(count++);
                print(t);
                toastQueue.put(t);
            }
        }catch (InterruptedException e){
            print("Toaster interrupted");
        }
        print("Toaster off");
    }
}
