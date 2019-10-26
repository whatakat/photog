package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class FailFast {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        Iterator<String> it = c.iterator();
        c.add("An object");
        print(c);
        try {
            String s = it.next();
        }catch (ConcurrentModificationException e){
            print(e);
        }
    }
}
