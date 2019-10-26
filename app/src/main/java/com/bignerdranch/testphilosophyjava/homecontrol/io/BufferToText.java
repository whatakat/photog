package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        FileChannel fc =
                new FileOutputStream("C:\\geekbrains\\7.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc = new FileInputStream("C:\\geekbrains\\7.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        print(buff.asCharBuffer());
        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        print("Decoded using "+ encoding + ": "
        + Charset.forName(encoding).decode(buff));
        fc = new FileOutputStream("C:\\geekbrains\\7.txt").getChannel();
        fc.write(ByteBuffer.wrap(
                "Some text".getBytes("UTF-16BE")));
        fc.close();
        fc = new FileInputStream("C:\\geekbrains\\7.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        print(buff.asCharBuffer());
        fc = new FileOutputStream("C:\\geekbrains\\7.txt").getChannel();
        buff = ByteBuffer.allocate(24);
        buff.asCharBuffer().put("Some text");
        fc.write(buff);
        fc.close();
        fc = new FileInputStream("C:\\geekbrains\\7.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        print(buff.asCharBuffer());

    }
}
