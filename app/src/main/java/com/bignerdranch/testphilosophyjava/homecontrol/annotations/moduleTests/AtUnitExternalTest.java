package com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests;

import com.bignerdranch.testphilosophyjava.homecontrol.io.OSExecute;

public class AtUnitExternalTest extends AtUnitExample1 {
    @Test boolean _methodOne(){
        return methodOne().equals("This is methodOne");
    }
    @Test boolean _methodTwo(){ return methodTwo()==2;}

    public static void main(String[] args) throws Exception{
        OSExecute.command(
                "java com...."
        );

    }
}
