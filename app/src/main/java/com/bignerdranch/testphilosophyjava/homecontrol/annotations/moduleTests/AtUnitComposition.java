package com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests;

import com.bignerdranch.testphilosophyjava.homecontrol.io.OSExecute;

public class AtUnitComposition {
    AtUnitExample1 testObject = new AtUnitExample1();
    @Test boolean _methodOne(){
        return
                testObject.methodOne().equals("This is methodOne");
    }
    @Test boolean _methodTwo(){
        return testObject.methodTwo() ==2;
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com..... AtUnitComposition"
        );

    }
}
