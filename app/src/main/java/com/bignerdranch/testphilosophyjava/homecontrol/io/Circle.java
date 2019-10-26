package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Circle extends Shape {
    private static int color =RED;
    public Circle(int xVal, int yVal, int dim){
        super(xVal,yVal,dim);
    }
    public static void serializeStaticState(ObjectOutputStream os) throws IOException {os.writeInt(color);}
    public static void deserializeStaticState(ObjectInputStream os) throws IOException{color = os.readInt();}
    public void setColor(int newColor){ color=newColor;}
    public int getColor(){return color;}
}

