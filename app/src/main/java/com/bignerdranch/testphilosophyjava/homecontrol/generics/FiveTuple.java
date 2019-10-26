package com.bignerdranch.testphilosophyjava.homecontrol.generics;

public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E fives;
    public FiveTuple(A a,B b,C c,D d,E e){
        super(a, b, c, d);
        fives=e;
    }
    public String toString(){
        return "("+first+", "+second+", "+third+", "+four+", "+fives+")";
    }
}
