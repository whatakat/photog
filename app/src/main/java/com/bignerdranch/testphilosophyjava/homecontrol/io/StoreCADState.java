package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class StoreCADState {
    public static void main(String[] args) throws Exception {
        List<Class<? extends Shape>> shapeTypes =
                new ArrayList<Class<? extends Shape>>();
        shapeTypes.add(Circle.class);
        shapeTypes.add(Square.class);
        shapeTypes.add(Line.class);
        List<Shape> shapes = new ArrayList<Shape>();
        for (int i = 0; i <10 ; i++)
            shapes.add(Shape.randomFactory());
        for (int i = 0; i <10 ; i++)
            ((Shape)shapes.get(i)).setColor(Shape.GREEN);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Geekbrains\\1.txt"));
        out.writeObject(shapeTypes);
        Line.serializeStaticState(out);
        Circle.serializeStaticState(out);
        Square.serializeStaticState(out);
        out.writeObject(shapes);
        print(shapes);

    }
}
