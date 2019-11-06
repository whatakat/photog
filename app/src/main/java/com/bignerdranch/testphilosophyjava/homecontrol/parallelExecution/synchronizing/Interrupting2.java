package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Interrupting2 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Blocked2());
        t.start();
        TimeUnit.SECONDS.sleep(1);
        print("Issuing t.interrupt()");
        t.interrupt();

    }
}
