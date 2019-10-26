package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.File;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class MakeDirectories {
    private static void usage(){
        System.err.println("Usege:MakeDirectories path1...\n"+
                "Creates each path\n"+
                "Usage:MakeDirectories -d path1...\n"+
                "Deletes each path\n"+
                "Usage:MakeDirectories -r path1 path2\n"+
                "Renames from path1 to path2");
        System.exit(1);
    }
    private static void fileData(File f){
        print(
                "Absolute path: "+f.getAbsolutePath()+
                "\n Can read: "+f.canRead()+
                "\n Can write: "+f.canWrite()+
                "\n getName: "+f.getName()+
                "\n getParent: "+f.getParent()+
                "\n getPath: "+f.getPath()+
                "\n length: "+f.length()+
                "\n lastModified: "+f.lastModified());
        if (f.isFile())
            print("It's a file");
        else if(f.isDirectory())
            print("It's a directory");
    }

    public static void main(String[] args) {
        if (args.length<1) usage();
        if (args[0].equals("-r")){
            if (args.length!=3) usage();
            File old = new File(args[1]),
                    rname = new File(args[2]);
            old.renameTo(rname);
            fileData(old);
            fileData(rname);
            return;
        }
        int count = 0;
        boolean del = false;
        if (args[0].equals("-d")){
            count++;
            del = true;
        }
        count--;
        while (++count<args.length){
            File f = new File(args[count]);
            if (f.exists()){
                print(f+" exist");
                if (del){
                    print("deliting..."+f);
                    f.delete();
                }
            }
            else {
                if (!del){
                    f.mkdirs();
                    print("created "+f);
                }
            }
            fileData(f);
        }
    }
}
