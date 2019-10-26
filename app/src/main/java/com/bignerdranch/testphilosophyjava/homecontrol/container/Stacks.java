package com.bignerdranch.testphilosophyjava.homecontrol.container;

import java.time.Month;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (Month m: Month.values())
            stack.push(m.toString());
        print("stack = "+stack);
        print("month.values :"+ Arrays.toString(Month.values()));
        stack.add("The last line");
        print("element 5 = "+stack.elementAt(5));
        print("poping elements: ");
        while (!stack.empty())
            printnb(stack.pop()+" ");
        LinkedList<String> lstack = new LinkedList<String>();
        for (Month m: Month.values())
            lstack.addFirst(m.toString());
        print("lstack = "+lstack);
        while (!lstack.isEmpty())
            printnb(lstack.removeFirst()+" ");

    }
}
