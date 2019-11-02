package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> result =
                new ArrayList<Future<String>>();
        for (int i = 0; i <10 ; i++)
            result.add(exec.submit(new TastWithResult(i)));
        for (Future<String> fs: result)
            try {
                print(fs.get());
            }catch (InterruptedException e){
                print(e);
                return;
            }catch (ExecutionException e){
                print(e);
            }finally {
                exec.shutdown();
            }
    }
}
