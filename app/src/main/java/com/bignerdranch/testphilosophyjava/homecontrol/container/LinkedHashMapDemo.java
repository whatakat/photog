package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.util.LinkedHashMap;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedMap =
                new LinkedHashMap<Integer,String>(
                        new CountingMapData(9));
        print(linkedMap);
        linkedMap =
                new LinkedHashMap<Integer,String>(16,0.75f,true);
        linkedMap.putAll(new CountingMapData(9));
        print(linkedMap);
        print(linkedMap.get(0));
        for (int i = 0; i <6 ; i++)
            linkedMap.get(i);
        print(linkedMap);
        print(linkedMap.get(0));
    }
}
