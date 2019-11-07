package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Jammer implements Runnable {
    private ToastQueue butteredQueue, finishedQueue;
    public Jammer(ToastQueue buttered, ToastQueue finished){
        butteredQueue = buttered;
        finishedQueue = finished;
    }
    public void run(){
        try {
            while (!Thread.interrupted()){
                Toast t = butteredQueue.take();
                t.jam();
                print(t);
                finishedQueue.put(t);
            }
        }catch (InterruptedException e){
            print("Jammer interrupted");
        }
        print("Jammer off");
    }
}
