package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

public class Task implements Runnable {
    static Blocker blocker = new Blocker();
    public void run(){blocker.waitingCall();}
}
