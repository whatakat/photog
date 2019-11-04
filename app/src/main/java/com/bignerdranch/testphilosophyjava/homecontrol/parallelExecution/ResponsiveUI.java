package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class ResponsiveUI extends Thread {
    private static volatile double d = 1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }
    public void run(){
        while (true){
            d = d+(Math.PI+Math.E)/d;
        }
    }

    public static void main(String[] args) throws Exception {
        new ResponsiveUI();
            System.in.read();
            print(d);



    }
}
