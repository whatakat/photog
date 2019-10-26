package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.util.Arrays;
import java.util.Collection;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class PPrint {
    public static String pformat(Collection<?> c){
        if (c.size()==0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (Object elem : c){
            if(c.size()!=1)
                result.append("\n ");
            result.append(elem);
        }
        if (c.size()!=1)
            result.append("\n");
        result.append("]");
        return result.toString();
    }
    public static void pprint(Collection<?> c){
        print(pformat(c));
    }
    public static void pprint(Object[] c){
        print(pformat(Arrays.asList(c)));
    }
}
