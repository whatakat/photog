package com.bignerdranch.testphilosophyjava.homecontrol.container;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class VeryBig {
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];
    private String ident;
    public VeryBig(String id){ident = id;}
    public String toString(){return  ident;}
    protected void finalize(){
        print("Finalizing "+ident);
    }
}
