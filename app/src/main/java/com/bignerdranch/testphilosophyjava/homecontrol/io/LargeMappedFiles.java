package com.bignerdranch.testphilosophyjava.homecontrol.io;


import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class LargeMappedFiles {
    static int length  = 0x8FFFFFF;

    public static void main(String[] args) throws Exception {
        MappedByteBuffer out =
                new RandomAccessFile("C:\\Geekbrains\\1.txt", "rw").getChannel()
                .map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i <length ; i++)
            out.put((byte)'x');
        print("Finish writing");
        for (int i = length/2; i <length/2+8 ; i++) {
            printnb((char)out.get(i));

        }

    }

}
