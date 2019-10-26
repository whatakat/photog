package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Meal {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (Course course: Course.values()){
                Food food = course.randomSelection();
                print(food);
            }
            print("---");

        }
    }
}
