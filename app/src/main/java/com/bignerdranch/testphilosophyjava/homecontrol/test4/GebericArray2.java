package com.bignerdranch.testphilosophyjava.homecontrol.test4;

public class GebericArray2<T> {
    private Object[] array;
    public GebericArray2(int sz){
        array=new Object[sz];
    }
    public void put(int index, T item){
        array[index]=item;
    }
    @SuppressWarnings("unchecked")
    public T get(int index){return (T)array[index];}
    @SuppressWarnings("unchecked")
    public T[] rep(){
        return (T[])array;
    }

    public static void main(String[] args) {
        GebericArray2<Integer> gai =
                new GebericArray2<Integer>(10);
        for (int i = 0; i <10 ; i++)
            gai.put(i,i);
        for (int i = 0; i <10 ; i++)
            System.out.print(gai.get(i)+" ");
        System.out.println();
        try {
            Integer[] ia = gai.rep();
        }catch (Exception e){
            System.out.println(e);
    }
    }
}
