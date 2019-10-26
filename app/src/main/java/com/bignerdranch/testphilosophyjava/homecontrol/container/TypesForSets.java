package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class TypesForSets {
    static <T> Set<T> fill(Set<T> set, Class<T> type){
        try {
            for (int i = 0; i <10 ; i++)
                set.add(
                        type.getConstructor(int.class).newInstance(i));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return set;
    }
    static <T> void test(Set<T> set, Class<T> type){
        fill(set, type);
        fill(set, type);
        fill(set, type);
        print(set);
    }

    public static void main(String[] args) {
        test(new HashSet<HashType>(),HashType.class);
        test(new LinkedHashSet<HashType>(),HashType.class);
        test(new TreeSet<TreeType>(),TreeType.class);
        // don't work
        test(new HashSet<SetType>(), SetType.class);
        test(new HashSet<TreeType>(), TreeType.class);
        test(new LinkedHashSet<SetType>(),SetType.class);
        test(new LinkedHashSet<TreeType>(),TreeType.class);
        try {
            test(new TreeSet<SetType>(), SetType.class);
        }catch (Exception e){
            print(e.getMessage());
        }
        try {
            test(new TreeSet<HashType>(), HashType.class);
        }catch (Exception e){
            print(e.getMessage());
        }
    }
}
