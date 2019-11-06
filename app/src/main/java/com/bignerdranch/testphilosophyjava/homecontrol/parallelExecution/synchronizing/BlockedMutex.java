package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class BlockedMutex {
    private Lock lock = new ReentrantLock();
    public BlockedMutex(){
        lock.lock();
    }
    public void f(){
        try {
            lock.lockInterruptibly();
            print("lock acquired in f()");
        }catch (InterruptedException e){
            print("Interrupted from lock acquisition in f()");
        }
    }
}
