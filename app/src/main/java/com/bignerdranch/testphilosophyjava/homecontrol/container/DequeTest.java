package com.bignerdranch.testphilosophyjava.homecontrol.container;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class DequeTest {
    static void fillTest(Deque<Integer> deque){
        for (int i = 20; i <27 ; i++)
            deque.addFirst(i);
        for (int i = 50; i <55 ; i++)
            deque.addLast(i);
    }

    public static void main(String[] args) {
        Deque<Integer> di = new Deque<Integer>();
        fillTest(di);
        print(di);
        while (di.size()!=3)
            printnb(di.removeFirst()+" ");
        print();
        print(di);
        fillTest(di);
        while (di.size()!=3)
            printnb(di.removeLast()+" ");
        print();
        print(di);
    }
}
