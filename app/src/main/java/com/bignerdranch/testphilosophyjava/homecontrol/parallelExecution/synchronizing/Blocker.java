package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Blocker {
    synchronized void waitingCall(){
        try {
            while (!Thread.interrupted()){
                wait();
                print(Thread.currentThread()+" ");
            }
        }catch (InterruptedException e){

        }
    }
    synchronized void prod(){notify();}
    synchronized void prodAll(){notifyAll();}
}
