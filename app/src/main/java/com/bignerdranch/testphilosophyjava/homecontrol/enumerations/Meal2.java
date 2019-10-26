package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public enum Meal2 {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    private Food[] values;
    private Meal2(Class<? extends Food> kind){
        values = kind.getEnumConstants();
    }
    public interface Food{
        enum Appetizer implements Food{
            SALAD, SOUP, SPRING_ROLLS;
        }
        enum MainCourse implements Food{
            LASAGNE, BURRITO, PAD_THAI,
            LENTILS, HUMMOUS, VINDALOO;
        }
        enum Dessert implements Food{
            TIRAMISU, GELATO, BLACK_FOREST_CAKE,
            FRUIT, CREME_CARAMEL;
        }
        enum Coffee implements Food{
            BLACK_COFFE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }
    public Food randomSelectiom(){
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (Meal2 meal: Meal2.values()){
                Food food = meal.randomSelectiom();
                print(food);
            }
            print("---");

        }
    }
}
