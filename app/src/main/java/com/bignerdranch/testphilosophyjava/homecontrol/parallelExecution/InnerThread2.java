package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class InnerThread2 {
    private int countDown = 5;
    private  Thread t;
    public InnerThread2(String name){
        t = new Thread(name){
            public void run(){
                try {
                    while (true){
                        print(this);
                        if (--countDown==0) return;
                        sleep(10);
                    }
                }catch (InterruptedException e){
                    print("sleep() interrupted");
                }
            }
            public String toString(){
                return getName()+": "+countDown;
            }
        };
        t.start();
    }
}
