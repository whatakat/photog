package com.bignerdranch.testphilosophyjava.homecontrol.trees;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Node {
    public PersonT personT;
    public Node leftChild;
    public Node rightChild;
    public void display(){
        print("Name: "+personT.name+", age: "+personT.age);
    }
}
