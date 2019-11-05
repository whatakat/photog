package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SerialNumberChecker {
    private static final int SIZE =10;
    private static CircularSet serials =
            new CircularSet(1000);
    private static ExecutorService exec =
            Executors.newCachedThreadPool();
    static class SerialChecker implements Runnable{
        public void run(){
            while (true){
                int serial =
                        SerialNumberGenerator.nextSerialNumber();
                if (serials.contains(serial)){
                    print("Duplicate: "+serial);
                    System.exit(0);
                }
                serials.add(serial);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i <SIZE ; i++)
            exec.execute(new SerialChecker());
        if (args.length>0){
            TimeUnit.SECONDS.sleep(new Integer(args[0]));
            print("No duplicates detected");
            System.exit(0);
        }

    }
}
