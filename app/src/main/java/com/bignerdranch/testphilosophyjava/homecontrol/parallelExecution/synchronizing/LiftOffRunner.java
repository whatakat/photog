package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.LiftOff;

import java.util.concurrent.BlockingQueue;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class LiftOffRunner implements Runnable {
    private BlockingQueue<LiftOff> rockets;
    public LiftOffRunner(BlockingQueue<LiftOff> queue){
        rockets = queue;
    }
    public void add(LiftOff lo){
        try {
            rockets.put(lo);
        }catch (InterruptedException e){
            print("Interrupted during put()");
        }
    }
    public void run(){
        try {
            while (!Thread.interrupted()){
                LiftOff rocket = rockets.take();
                rocket.run();
            }
        }catch (InterruptedException e){
            print("Waking from take()");
        }
        print("Exiting LiftOffRunner");
    }
}
