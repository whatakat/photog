package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.*;


public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();
        Collections.addAll(sortedSet,"one two three four five six seven eight"
                .split(" "));
        print(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        print(low);
        print(high);
        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <=6 ; i++) {
            if (i==3) low = it.next();
            if (i==6) high = it.next();
            else it.next();
        }
        print("1"+low);
        print("2"+high);
        print(sortedSet.subSet(low,high));
        print(sortedSet.headSet(low));
        print(sortedSet.tailSet(low));
    }
}
