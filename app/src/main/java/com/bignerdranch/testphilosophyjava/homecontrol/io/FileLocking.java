package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class FileLocking {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Geekbrains\\1.txt");
        FileLock fl = fos.getChannel().tryLock();
        if (fl !=null){
            print("Locked File");
            TimeUnit.MILLISECONDS.sleep(10000);
            fl.release();
            print("Released Lock");
        }
        fos.close();

    }
}
