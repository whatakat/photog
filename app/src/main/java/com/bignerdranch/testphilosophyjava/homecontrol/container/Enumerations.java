package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Enumerations {
    public static void main(String[] args) {
        Vector<String> v =
                new Vector<String>(Countries.names(6));
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements())
            print(e.nextElement()+", ");
        e = Collections.enumeration(new ArrayList<String>());
    }
}
