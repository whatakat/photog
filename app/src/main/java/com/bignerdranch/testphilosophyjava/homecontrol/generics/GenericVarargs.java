package com.bignerdranch.testphilosophyjava.homecontrol.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args){
        List<T> result = new LinkedList<T>();
        for (T item: args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A","B","C");
        System.out.println(ls);
        ls = makeList("ABCDEFFHIJKLMNOPQRATUVWXYZ".split(""));
        System.out.println(ls);
    }
}
