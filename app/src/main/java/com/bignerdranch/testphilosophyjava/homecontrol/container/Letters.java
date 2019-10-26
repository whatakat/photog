package com.bignerdranch.testphilosophyjava.homecontrol.container;

import com.bignerdranch.testphilosophyjava.homecontrol.generator.Generator;
import com.bignerdranch.testphilosophyjava.homecontrol.test8.CountingGenerator;

import java.util.Iterator;

public class Letters implements Generator<Pair<Integer,String>>,
    Iterable<Integer>{
    private int size = 9;
    private int number = 1;
    private char letter = 'A';
    public Pair<Integer, String> next(){
        return new Pair<Integer, String>(
                number++,""+letter++);
    }
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number<size;}

            @Override
            public Integer next() {
                return number++;
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}

