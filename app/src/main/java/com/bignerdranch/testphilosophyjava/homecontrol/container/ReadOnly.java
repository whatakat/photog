package com.bignerdranch.testphilosophyjava.homecontrol.container;

import com.bignerdranch.testphilosophyjava.homecontrol.test8.CountingGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class ReadOnly {
    static Collection<String> data =
            new ArrayList<String>(Countries.names(6));

    public static void main(String[] args) {
        Collection<String> c =
                Collections.unmodifiableCollection(new ArrayList<String>(data));
        print(c);
        List<String> a = Collections.unmodifiableList(
                new ArrayList<String>(data));

        ListIterator<String> lit = a.listIterator();
        print(lit.next());
        Set<String> s = Collections.unmodifiableSet(
                new HashSet<String>(data));
        print(s);
        Set<String> ss = Collections.unmodifiableSortedSet(
                new TreeSet<String>(data));
        Map<String, String> m = Collections.unmodifiableMap(
                new HashMap<String,String>(Countries.capitals(6)));
        print(m);
        Map<String, String> sm =
                Collections.unmodifiableSortedMap(
                        new TreeMap<String, String>(Countries.capitals(6)));
        print(sm);


    }
}
