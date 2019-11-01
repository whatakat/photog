package com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests;

import com.bignerdranch.testphilosophyjava.homecontrol.io.OSExecute;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class AtUtilExample3 {
    private int n;
    public AtUtilExample3(int n){this.n = n;}
    public int getN(){return n;}
    public String methodOne(){
        return "This is methodOne";
    }
    public int methodTwo(){
        print("This is methodTwo");
        return 2;
    }
    @TestObjectCreate static AtUtilExample3 create(){
        return new AtUtilExample3(47);
    }
    @Test boolean initialization(){return n==47;}
    @Test boolean methodOneTest(){
        return methodOne().equals("This is methodOne");
    }
    @Test boolean m2(){return methodTwo()==2;}

    public static void main(String[] args) throws Exception{
        OSExecute.command(
                "java com.....AtUnitExample3"
        );

    }
}
