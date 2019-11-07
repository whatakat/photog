package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing.restaurant;

import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Chef implements Runnable {
    private Restaurant restaurant;
    private int count = 0;
    public Chef(Restaurant r){restaurant =r;}
    public void run(){
        try {
            while (!Thread.interrupted()){
                synchronized (this){
                    while (restaurant.meal !=null)
                        wait();
                }
                if (++count ==10){
                    print("Out of food,closing");
                    restaurant.exec.shutdownNow();
                }
                print("Order up!");
                synchronized (restaurant.waitPerson){
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.notifyAll();
                }
                TimeUnit.MILLISECONDS.sleep(100);
            }
        }catch (InterruptedException e){
            print("Chef interrupted");
        }
    }
}
