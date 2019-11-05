package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

public class SyncObject {
    public static void main(String[] args) {
        final DualSynch ds = new DualSynch();
        new Thread(){
            public void run(){
                ds.f();
            }
        }.start();
        ds.g();
    }
}
