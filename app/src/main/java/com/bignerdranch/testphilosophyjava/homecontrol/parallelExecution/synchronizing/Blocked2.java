package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Blocked2 implements Runnable {
    BlockedMutex blocked = new BlockedMutex();
    public void run(){
        print("Waiting for f() in BlockedMutex");
        blocked.f();
        print("Broken out of blocked call");
    }
}
