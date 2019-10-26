package com.bignerdranch.testphilosophyjava.homecontrol.container;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PropertyResourceBundle;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;


public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;
    public static void basicTest(List<String> a){
        a.add(1,"x");
        a.add("x");
        a.addAll(Countries.names(6));
        a.addAll(3,Countries.names(6));
        b= a.contains("1");
        b= a.containsAll(Countries.names(6));
        s=a.get(1);
        i=a.indexOf("1");
        b=a.isEmpty();
        it=a.iterator();
        lit=a.listIterator();
        lit=a.listIterator(3);
        i=a.lastIndexOf("1");
        a.remove(1);
        a.remove("3");
        a.set(1,"y");
        a.retainAll(Countries.names(6));
        a.removeAll(Countries.names(6));
        i = a.size();
        a.clear();
        print("END BASIC TEST");
    }
    public static void iterMotion(List<String> a){
        ListIterator<String> it = a.listIterator();
        b=it.hasNext();
        b=it.hasPrevious();
        s=it.next();
        i=it.nextIndex();
        s=it.previous();
        i=it.previousIndex();
        print("END ITER MOTION");
    }
    public static void iterManipulation(List<String> a){
        ListIterator<String> it = a.listIterator();
        it.add("47");
        it.next();
        it.remove();
        it.next();
        it.set("47");
        print("END ITER MONIPULATION");
    }
    public static void testVisual(List<String> a){
        System.out.println(a);
        List<String> b = Countries.names(6);
        System.out.println("b = "+b);
        a.addAll(b);
        a.addAll(b);
        System.out.println(a);
        ListIterator<String> x = a.listIterator(a.size()/2);
        x.add("one");
        print(a);
        print(x.next());
        x.remove();
        print(x.next());
        x.set("47");
        print(a);
        x = a.listIterator(a.size());
        while (x.hasPrevious())
            printnb(x.previous()+" ");
        print();
        print("END testVisual");

    }
    public static void testLinkedList(){
        LinkedList<String> ll = new LinkedList<String>();
        ll.addAll(Countries.names(6));
        print(ll);
        ll.addFirst("one");
        ll.addFirst("two");
        print(ll);
        print(ll.getFirst());
        print(ll.removeFirst());
        print(ll.removeFirst());
        print(ll.removeLast());
        print(ll);
        print("END TEST LINKED LIST");
    }

    public static void main(String[] args) {
        basicTest(
                new LinkedList<String>(Countries.names(6)));
        basicTest(
                new ArrayList<String>(Countries.names(6)));
        iterMotion(
                new LinkedList<String>(Countries.names(6)));
        iterManipulation(
                new LinkedList<String>(Countries.names(6)));
        iterManipulation(
                new ArrayList<String>(Countries.names(6)));
        testVisual(
                new LinkedList<String>(Countries.names(6)));
        testLinkedList();
    }

}
