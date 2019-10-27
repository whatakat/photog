package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public enum LikeClasses {
    WINKEN{void behavior(){print("Behavior1");}},
    BLINKEN{void behavior(){print("Behavior2");}},
    NOD{void behavior(){print("Behavior3");}};
    abstract void behavior();

}
