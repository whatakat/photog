package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private House preferredHose;
    Animal(String nm, House h ){
        name= nm;
        preferredHose = h;
    }
    public String toString(){
        return name +"["+super.toString()+
                "],"+preferredHose+"\n";
    }
}
