package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.util.Iterator;
import java.util.TreeMap;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SortedMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap =
                new TreeMap<Integer, String>(new CountingMapData(10));
        print(sortedMap);
        Integer low = sortedMap.firstKey();

        Integer high = sortedMap.lastKey();
        print(low);
        print(high);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0; i <=6 ; i++) {
            if(i==3)low = it.next();
            if(i==6)high= it.next();
            else print("itNext(): "+it.next());
            print("low: "+low+" high: "+high);
        }
        print(low);
        print(high);

    }
}
