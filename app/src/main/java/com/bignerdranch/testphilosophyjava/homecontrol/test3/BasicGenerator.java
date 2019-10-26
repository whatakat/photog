package com.bignerdranch.testphilosophyjava.homecontrol.test3;

import android.graphics.BitmapFactory;

import com.bignerdranch.testphilosophyjava.homecontrol.generator.Generator;

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type){this.type = type;}
    public T next(){
        try {
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
