package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import java.util.EnumSet;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.AlarmPoints.*;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;
import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.printnb;

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points =
                EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        print(points);
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        print(points);
        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        print(points);
        points.removeAll(EnumSet.range(OFFICE1, OFFICE4));//remove(del) between office1 and office4
        print(points);
        points = EnumSet.complementOf(points);
        print(points);
    }
}
