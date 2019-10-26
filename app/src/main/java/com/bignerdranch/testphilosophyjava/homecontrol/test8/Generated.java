package com.bignerdranch.testphilosophyjava.homecontrol.test8;

import com.bignerdranch.testphilosophyjava.homecontrol.container.CollectionData;
import com.bignerdranch.testphilosophyjava.homecontrol.generator.Generator;

public class Generated {
    public static <T> T[] array(T[] a, Generator<T> gen){
        return new CollectionData<T>(gen, a.length).toArray(a);
    }
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size){
        T[] a =
                (T[])java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen,size).toArray(a);
    }
}
