package com.bignerdranch.testphilosophyjava.homecontrol.container;

import com.bignerdranch.testphilosophyjava.homecontrol.test8.CountingGenerator;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();
    public V put(K key, V value){
        V oldValue = get(key);
        if (!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else
            values.set(keys.indexOf(key), value);
        return oldValue;
    }
    public V get(Object key){
        if (!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }
    public Set<Map.Entry<K, V>> entrySet(){
        Set<Map.Entry<K,V>> set =new HashSet<Map.Entry<K,V>>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext())
            set.add(new MapEntry<K,V>(ki.next(), vi.next()));
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> m = new SlowMap<String, String>();
        m.putAll(Countries.capitals(5));
        print(m);
        print(m.get("BULGARIA"));
        print(m.entrySet());
    }
}
