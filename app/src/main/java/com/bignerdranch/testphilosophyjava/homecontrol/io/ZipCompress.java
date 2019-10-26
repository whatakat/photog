package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class ZipCompress {
    public static void main(String[] args)throws IOException {
        FileOutputStream f = new FileOutputStream("test.zip");
        CheckedOutputStream csum =
                new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out =
                new BufferedOutputStream(zos);
        zos.setComment("A test of Java Zipping");
        for (String arg: args){
            print("Writing file "+arg);
            BufferedReader in  =
                    new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c = in.read())!=-1)
                out.write(c);
            in.close();
            out.flush();
        }
        out.close();
        print("Checksum: "+csum.getChecksum().getValue());
        print("Reading file");
        FileInputStream fi = new FileInputStream("test.zip");
        CheckedInputStream csumi =
                new CheckedInputStream(fi,new Adler32());
        ZipInputStream in2 = new ZipInputStream(csumi);
        BufferedInputStream bis = new BufferedInputStream(in2);
        ZipEntry ze;
        while ((ze = in2.getNextEntry())!=null){
            print("Reading file "+ze);
            int x;
            while ((x = bis.read())!=-1)
                System.out.write(x);
        }
        if (args.length==1)
            print("Checksum: "+csumi.getChecksum().getValue());
        bis.close();
        ZipFile zf = new ZipFile("test.zip");
        Enumeration e = zf.entries();
        while (e.hasMoreElements()){
            ZipEntry ze2 = (ZipEntry)e.nextElement();
            print("File: "+ze2);
        }

    }
}
