package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.io.IOException;
import java.io.PipedReader;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Receiver implements Runnable {
    private PipedReader in;
    public Receiver(Sender sender) throws IOException{
        in = new PipedReader(sender.getPipedWriter());
    }
    public void run(){
        try {
            while (true){
                print("Read: "+(char)in.read()+", ");
            }
        }catch (IOException e){
            print(e+" Receiver read exception");
        }
    }
}
