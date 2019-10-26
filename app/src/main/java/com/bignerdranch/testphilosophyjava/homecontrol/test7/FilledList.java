package com.bignerdranch.testphilosophyjava.homecontrol.test7;

import java.util.ArrayList;

public class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size){
        try {
            for (int i = 0; i <size ; i++)
                add(type.newInstance());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
