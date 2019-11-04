package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class AttemptLocking {
    private ReentrantLock lock= new ReentrantLock();
    public void untimed(){
        boolean captured = lock.tryLock();
        try {
            print("tryLock(): "+captured);
        }finally {
            if (captured)
                lock.unlock();
        }
    }
    public void timed(){
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        try {
            print("tryLock(2, TimeUnit.SECONDS): "+
                    captured);
        }finally {
            if (captured)
                lock.unlock();
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();
        new Thread(){
            {setDaemon(true);}
            public void run(){
                al.lock.lock();
                print("acquired");
            }
        }.start();
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
