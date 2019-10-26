package com.bignerdranch.testphilosophyjava.homecontrol.container;

import com.bignerdranch.testphilosophyjava.homecontrol.test8.CountingGenerator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class AssociariveArray<K,V> {
    private Object[][] pairs;
    private int index;
    public AssociariveArray(int length){
        pairs = new Object[length][2];
    }
    public void put(K key, V value){
        if (index>=pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[]{key, value};
    }
    @SuppressWarnings("unchecked")
    public V get(K key){
        for (int i = 0; i <index ; i++)
            if (key.equals(pairs[i][0]))
                return (V)pairs[i][1];
            return null;
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <index ; i++) {
            result.append(pairs[i][0].toString());
            result.append(" : ");
            result.append(pairs[i][1].toString());
            if (i<index-1)
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
       /* AssociariveArray<String, String> map =
                new AssociariveArray<String, String>(6);
        Map<String,String> map = new HashMap<String,String>(6);
        Map<String,String> map = new TreeMap<String,String>();*/
       //It's a working methods  up
        Map<String,String> map = new LinkedHashMap<String,String>(6);
        map.put("sky", "blue");
        map.put("grass","green");
        map.put("ocean","dancing");
        map.put("tree","tall");
        map.put("earth","brown");
        map.put("sun","warm");
        try {
            map.put("extra","object");
        }catch (ArrayIndexOutOfBoundsException e){
            print("Too many objects!");
        }
        print(map);
        print(map.get("ocean"));
    }
}
