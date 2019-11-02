package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.concurrent.Callable;

public class TastWithResult implements Callable<String> {
    private int id;
    public TastWithResult(int id){
        this.id = id;
    }
    public String call(){
        return "result of TaskWithResult "+ id;
    }
}
