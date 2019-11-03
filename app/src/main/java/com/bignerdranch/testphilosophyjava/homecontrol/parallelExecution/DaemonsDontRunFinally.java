package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}
