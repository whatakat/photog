package com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests;

import java.util.LinkedList;

public class StackL<T> {
    private LinkedList<T> list = new LinkedList<T>();
    public void push(T v){list.addFirst(v);}
    public T top(){return list.getFirst();}
    public T pop(){return list.removeFirst();}
}
