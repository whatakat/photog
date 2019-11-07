package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Butterer implements Runnable {
    private ToastQueue dryQueue , butteredQueue;
    public Butterer(ToastQueue dry, ToastQueue butterer){
        dryQueue = dry;
        butteredQueue = butterer;
    }
    public void run(){
        try {
            while (!Thread.interrupted()){
                Toast t = dryQueue.take();
                t.butter();
                print(t);
                butteredQueue.put(t);
            }
        }catch (InterruptedException e){
            print("Butterer interrupted");
        }
        print("Butter off");
    }
}
