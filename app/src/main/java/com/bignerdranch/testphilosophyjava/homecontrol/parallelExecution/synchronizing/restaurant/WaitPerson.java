package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing.restaurant;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class WaitPerson implements Runnable {
    private Restaurant restaurant;
    public WaitPerson(Restaurant r){restaurant = r;}
    public void run(){
        try {
            while (!Thread.interrupted()){
                synchronized (this){
                    while (restaurant.meal ==null)
                        wait();
                }
                print("Waitperson got "+restaurant.meal);
                synchronized (restaurant.chef){
                    restaurant.meal=null;
                    restaurant.chef.notifyAll();
                }
            }
        }catch (InterruptedException e){
            print("WaitPerson interrupted");
        }
    }
}
