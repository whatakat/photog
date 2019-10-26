package com.bignerdranch.testphilosophyjava.homecontrol.test3;

import java.sql.SQLOutput;
import java.util.EnumSet;
import java.util.Set;

import static com.bignerdranch.testphilosophyjava.homecontrol.test3.Watercolors.*;
import static com.bignerdranch.testphilosophyjava.homecontrol.test3.Sets.*;



public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(F_BRILLIANT_RED,P_VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(K_CERULLEAN_BLUE_HUE,U_BURNT_UMBER);
        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);
        System.out.println("union(set1, set2): "+union(set1,set2));
        Set<Watercolors> subset = intersection(set1,set2);
        System.out.println("intersection(set1, set2): "+subset);
        System.out.println("difference(set1, subset): "+difference(set1, subset));
        System.out.println("difference(set2, subset): "+difference(set2, subset));
        System.out.println("complement(set1,set2): "+complement(set1,set2));


    }
}
