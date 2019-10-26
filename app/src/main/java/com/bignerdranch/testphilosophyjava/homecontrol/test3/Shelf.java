package com.bignerdranch.testphilosophyjava.homecontrol.test3;

import com.bignerdranch.testphilosophyjava.homecontrol.generator.Generator;

import java.util.ArrayList;

public class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts){
        Generators.fill(this, Product.generator,nProducts);
    }
}
