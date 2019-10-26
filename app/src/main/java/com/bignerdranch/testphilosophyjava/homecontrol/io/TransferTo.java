package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class TransferTo {
    public static void main(String[] args) throws Exception {
        if (args.length !=2){
            print("arguments: sourcefile destfile");
            System.exit(1);
        }
        FileChannel in = new FileInputStream(args[0]).getChannel(),
                out = new FileOutputStream(args[1]).getChannel();
        in.transferTo(0,in.size(),out);


    }
}
