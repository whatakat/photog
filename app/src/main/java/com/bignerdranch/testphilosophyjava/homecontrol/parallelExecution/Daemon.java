package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class Daemon implements Runnable {
    private Thread[] t = new Thread[10];
    public void run(){
        for (int i = 0; i <t.length ; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            printnb("DaemonSpawn "+i+" started, ");
        }
        for (int i = 0; i <t.length ; i++)
            printnb("t["+i+"].isDaemon() = "+
                    t[i].isDaemon()+", ");
        while (true)
            Thread.yield();
    }
}
