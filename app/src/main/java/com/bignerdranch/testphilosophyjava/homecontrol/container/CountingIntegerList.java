package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.util.AbstractList;
import java.util.Arrays;

public class CountingIntegerList extends AbstractList<Integer> {
    private int size;
    public CountingIntegerList(int size){
        this.size = size<0 ? 0: size;
    }
    public Integer get(int index){
        return Integer.valueOf(index);
    }
    public int size(){return size;}

    public static void main(String[] args) {
        CountingIntegerList cil=new CountingIntegerList(30);
        System.out.println();

    }

}
