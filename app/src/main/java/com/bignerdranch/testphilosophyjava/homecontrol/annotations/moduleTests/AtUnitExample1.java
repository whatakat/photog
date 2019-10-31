package com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests;

import com.bignerdranch.testphilosophyjava.homecontrol.io.OSExecute;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class AtUnitExample1 {
    public String methodOne(){
        return "This is methodOne";
    }
    public int methodTwo(){
        print("This is methodTwo");
        return 2;
    }
    @Test boolean metodOneTest(){
        return methodOne().equals("This is methodOne");
    }
    @Test boolean m2(){return methodTwo()==2;}
    @Test private boolean m3(){return true;}
    @Test boolean failureTest(){return false;}
    @Test boolean anotherDisappointment(){return false;}

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests"
        );//How can? command

    }
}
