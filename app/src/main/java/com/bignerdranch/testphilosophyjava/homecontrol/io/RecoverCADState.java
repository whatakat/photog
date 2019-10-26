package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class RecoverCADState {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Geekbrains\\1.txt"));
        List<Class<? extends Shape>> shapeTypes =
                (List<Class<? extends Shape>>)in.readObject();
        Line.deserializeStaticState(in);
        Circle.deserializeStaticState(in);
        Square.deserializeStaticState(in);
        List<Shape> shapes = (List<Shape>)in.readObject();
        print(shapes);

    }
}
