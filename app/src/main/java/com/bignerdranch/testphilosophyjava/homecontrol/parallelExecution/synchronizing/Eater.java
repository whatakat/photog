package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Eater implements Runnable {
    private ToastQueue finishedQueue;
    private int counter = 0;
    public Eater(ToastQueue finished){
        finishedQueue = finished;
    }
    public void run(){
        try {
            while (!Thread.interrupted()){
                Toast t = finishedQueue.take();
                if (t.getId() !=counter++||
                t.getStatus()!=Toast.Status.JAMMED){
                    print(">>> Error: "+t);
                    System.exit(1);
                }else
                    print("Chomp! "+t);
            }
        }catch (InterruptedException e){
            print("Eater interrupted");
        }
        print("Eater off");
    }
}
