package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class DirList3 {
    public static void main(final String[] args) {
        int size=0;
        File path = new File(".");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem: list)
            size = size+dirItem.hashCode();
        print(size);

    }
}
