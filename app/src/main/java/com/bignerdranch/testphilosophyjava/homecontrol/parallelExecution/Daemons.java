package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class Daemons {
    public static void main(String[] args) throws Exception{
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        printnb("d.isDaemon() = "+d.isDaemon()+", ");
        TimeUnit.SECONDS.sleep(1);
    }
}
