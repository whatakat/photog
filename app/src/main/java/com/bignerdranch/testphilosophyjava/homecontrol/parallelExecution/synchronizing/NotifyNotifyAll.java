package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class NotifyNotifyAll {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i <5 ; i++)
            exec.execute(new Task());
        exec.execute(new Task2());
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            boolean prod = true;
            @Override
            public void run() {
                if (prod){
                    print("\nnotify() ");
                    Task.blocker.prod();
                    prod = false;
                }else {
                    print("\nnotifyAll() ");
                    Task.blocker.prodAll();
                    prod = true;
                }

            }
        },400,400);
        TimeUnit.SECONDS.sleep(5);
        timer.cancel();
        print("\nTimer canceled");
        TimeUnit.MILLISECONDS.sleep(500);
        print("Task2.blocker.prodAll() ");
        Task2.blocker.prodAll();
        TimeUnit.MILLISECONDS.sleep(500);
        print("\nShutting down");
        exec.shutdownNow();

    }
}
