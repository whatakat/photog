package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SocketChannel;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class NIOBlocked implements Runnable {
    private final SocketChannel sc;
    public NIOBlocked(SocketChannel sc){this.sc = sc;}
    public void run(){
        try {
            print("Waiting for read() in "+this);
            sc.read(ByteBuffer.allocate(1));
        }catch (ClosedByInterruptException e){
            print("ClosedByInterruptException");
        }catch (AsynchronousCloseException e){
            print("AsynchronousCloseException");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        print("Exiting NIOBlocked.run() "+this);
    }
}

