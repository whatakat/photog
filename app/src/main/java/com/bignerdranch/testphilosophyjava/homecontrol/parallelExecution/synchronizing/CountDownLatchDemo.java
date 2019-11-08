package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class CountDownLatchDemo {
    static final int SIZE =100;

    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(SIZE);
        for (int i = 0; i <10 ; i++)
            exec.execute(new WaitingTask(latch));
        for (int i = 0; i <SIZE ; i++)
            exec.execute(new TaskPortion(latch));
        print("Launched all task");
        exec.shutdown();

    }
}
