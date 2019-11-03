package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SelfManaged implements Runnable {
    private int countDown =5;
    private Thread t = new Thread(this);
    public SelfManaged(){t.start();}
    public String toString(){
        return Thread.currentThread().getName()+
                "("+countDown+"),";
    }
    public void run(){
        while (true){
            print(this);
            if (--countDown ==0)
                return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++)
            new SelfManaged();
    }
}
