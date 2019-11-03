package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

public class DaemonSpawn implements Runnable {
    public void run(){
        while (true)
            Thread.yield();
    }
}
