package com.bignerdranch.testphilosophyjava.homecontrol.fibonacci;

public class GenericMethods {

    public <T> void f(T x, T y, int z){

        System.out.println(x.getClass().getName()+" "+y.getClass().getName()+" "+z+" ");
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("",1,5);

    }
}
