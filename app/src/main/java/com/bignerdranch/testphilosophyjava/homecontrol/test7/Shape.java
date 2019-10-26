package com.bignerdranch.testphilosophyjava.homecontrol.test7;

public class Shape {
    public void rotate(){
        System.out.println(this.getClass().getSimpleName() +" rotate");
    }
    public void resize(int newSize){
        System.out.println(this.getClass().getSimpleName() + " resize "+newSize);
    }
}
