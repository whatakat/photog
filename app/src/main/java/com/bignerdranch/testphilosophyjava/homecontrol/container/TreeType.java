package com.bignerdranch.testphilosophyjava.homecontrol.container;

public class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int n){super(n);}
    public int compareTo(TreeType arg){
        return (arg.i<i ? -1:(arg.i == i?0:1));
    }
}
