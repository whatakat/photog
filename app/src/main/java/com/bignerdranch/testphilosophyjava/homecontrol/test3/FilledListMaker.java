package com.bignerdranch.testphilosophyjava.homecontrol.test3;

import java.util.ArrayList;
import java.util.List;

public class FilledListMaker<T> {
    List<T> create(T t, int n){
        List<T> result = new ArrayList<T>();
        for (int i = 0; i <n ; i++)
            result.add(t);
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<Integer> stringMarker=
                new FilledListMaker<Integer>();
        List<Integer> list = stringMarker.create(5,4);
        System.out.println(list);
    }
}
