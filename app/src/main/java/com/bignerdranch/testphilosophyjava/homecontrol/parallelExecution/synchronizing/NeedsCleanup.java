package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class NeedsCleanup {
    private final int id;
    public NeedsCleanup(int ident){
        id=ident;
        print("NeedsCleanup "+id);
    }
    public void cleanup(){
        print("Cleaning up "+id);
    }
}
