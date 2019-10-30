package com.bignerdranch.testphilosophyjava.homecontrol.annotations;


public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
