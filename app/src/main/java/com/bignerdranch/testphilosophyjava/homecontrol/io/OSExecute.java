package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class OSExecute {
    public static void command(String command){
        boolean err = false;
        try {
            Process process =
                    new ProcessBuilder(command.split(" ")).start();
            BufferedReader result = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String s;
            while ((s= result.readLine())!=null)
                print(s);
            BufferedReader errors = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));
            while ((s=errors.readLine())!=null){
                System.err.println(s);
                err=true;
            }
        }catch (Exception e){
            if (!command.startsWith("CMD /C"))
                command("CMD /C "+command);
            else
                throw new RuntimeException(e);
        }
        if (err)
            throw new OSExecuteException("Errors executing "+command);
    }
}
