package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public enum OverrideConstantSpecific {
    NUT, BOLT,WASHER{
        void f(){print("Overridden method");}
    };
    void f(){print("default behavior");}

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs: values()){
            printnb(ocs + ": ");
            ocs.f();
        }
    }
}
