package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSR(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;
    private Course(Class<? extends Food> kind){
        values=kind.getEnumConstants();
    }
    public Food randomSelection(){
        return Enums.random(values);
    }
}
