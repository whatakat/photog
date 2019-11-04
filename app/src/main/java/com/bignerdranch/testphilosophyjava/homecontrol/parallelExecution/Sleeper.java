package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Sleeper extends Thread {
    private int duration;
    public Sleeper(String name, int sleepTime){
        super(name);
        duration=sleepTime;
        start();
    }
    public void run(){
        try {
            sleep(duration);
        }catch (InterruptedException e){
            print(getName()+" was interrupted. "+
                    "isInterrupted(): "+isInterrupted());
            return;
        }
        print(getName() + " has awakened");
    }
}
