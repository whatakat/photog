package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.Speciness.*;

public class Burrito {
    Speciness degree;
    public Burrito(Speciness degree){this.degree=degree;}
    public String toString(){return "Burrito is "+degree;}

    public static void main(String[] args) {
        print(new Burrito(NOT));
        print(new Burrito(MEDIUM));
        print(new Burrito(HOT));


    }

}
