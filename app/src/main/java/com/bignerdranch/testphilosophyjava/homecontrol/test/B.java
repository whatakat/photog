package com.bignerdranch.testphilosophyjava.homecontrol.test;

public class B implements A {
    @Override
    public void f() {
        System.out.println("f() in B");
    }
    public void g(){
        System.out.println("g() in B");
    }
}
