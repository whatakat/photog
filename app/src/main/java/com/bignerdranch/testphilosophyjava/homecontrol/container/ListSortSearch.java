package com.bignerdranch.testphilosophyjava.homecontrol.container;

import com.bignerdranch.testphilosophyjava.homecontrol.test8.CountingGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class ListSortSearch {
    public static void main(String[] args) {
        List<String> list =
                new ArrayList<String>(Utilities.list);
        list.addAll(Utilities.list);
        print(list);
        Collections.shuffle(list, new Random(47));
        print("Shuffled: "+list);
        ListIterator<String> it =list.listIterator(10);
        while (it.hasNext()){
            it.next();
            it.remove();
        }
        print("Trimmed: "+list);
        Collections.sort(list);
        print("Sorted: "+list);
        String key = list.get(1);
        int index = Collections.binarySearch(list,key);
        print("Location of "+key + " is "+index+
                ", list.get("+index+") = "+list.get(index));
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        print("Case-insensitive sorted: "+list);
        key = list.get(1);
        index =Collections.binarySearch(list,key, String.CASE_INSENSITIVE_ORDER);
        print("Location of "+key+" is "+index+
                ", list.get("+index+") = "+list.get(index));

    }
}
