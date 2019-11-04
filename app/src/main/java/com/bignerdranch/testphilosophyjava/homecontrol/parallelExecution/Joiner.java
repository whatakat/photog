package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Joiner extends Thread {
    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper){
        super(name);
        this.sleeper = sleeper;
        start();
    }
    public void run(){
        try {
            sleeper.join();
        }catch (InterruptedException e){
            print("Interrupted");
        }
        print(getName()+" join completed");
    }
}
