package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Appetizer.SALAD;
        Food food1 = Food.MainCourse.LASAGNE;
        Food food2 = Food.Dessert.GELATO;
        Food food3 = Food.Coffee.CAPPUCCINO;
        print(food+", "+food1+", "+food2+", "+food3);
    }
}
