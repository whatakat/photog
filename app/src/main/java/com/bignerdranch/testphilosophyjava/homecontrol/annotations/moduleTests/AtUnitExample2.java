package com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests;

import com.bignerdranch.testphilosophyjava.homecontrol.io.OSExecute;

import java.io.FileInputStream;
import java.io.IOException;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class AtUnitExample2 {
    public String methodOne(){
        return "This is methodOne";
    }
    public int methodTwo(){
        print("This is methodTwo");
        return 2;
    }
    @Test void assertExample(){
        assert methodOne().equals("This is methodOne");
    }
    @Test void assertFailureExample(){
        assert 2 ==2: "What a surprise!";
    }
    @Test void exceptionExample() throws IOException{
        new FileInputStream("nofile.txt");
    }
    @Test boolean assertAndReturn(){
        assert methodTwo() ==2: "methodTwo must equal 2";
        return methodOne().equals("This is methodOne");
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.....AtUnitExample2"
        );

    }
}
