package com.bignerdranch.testphilosophyjava.homecontrol.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapChekedException wce = new WrapChekedException();
        wce.throwRuntimeException(3);
        for (int i = 0; i <4 ; i++) {
            try {
                if(i<3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            }catch (SomeOtherException e){
                System.out.println("SomeOtherException: "+e);
            }catch (RuntimeException re){
                try {
                    throw re.getCause();
                }catch (FileNotFoundException e){
                    System.out.println("FileNotFoundException: "+e);
                }catch (IOException e){
                    System.out.println("IOException: "+e);
                }catch (Throwable e){
                    System.out.println("Throwable: "+e);
                }
            }

        }
    }
}
