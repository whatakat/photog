package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class IntBufferDemo {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb= ByteBuffer.allocate(BSIZE);
        IntBuffer ib = bb.asIntBuffer();
        ib.put(new int[]{11,42,47,99,143,811,1016});
        print(ib.get(3));
        ib.put(3,1811);
        ib.flip();
        while (ib.hasRemaining()){
            int i = ib.get();
            print(i);
        }
    }
}
