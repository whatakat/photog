package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;
    public SimpleThread(){
        super(Integer.toString(++threadCount));
        start();
    }
    public String toString(){
        return "#"+getName()+"("+countDown+"),";
    }
    public void run(){
        while (true){
            print(this);
            if (--countDown==0)
                return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++)
            new SimpleThread();
    }
}
