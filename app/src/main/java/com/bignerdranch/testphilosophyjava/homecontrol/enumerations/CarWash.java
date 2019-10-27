package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import android.service.voice.VoiceInteractionService;

import java.util.EnumSet;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class CarWash {
    public enum Cycle{
        UNDERBODY{
            void action(){print("Spraying the underbody");}
        },
        WHEELWASH{
            void action(){print("Washing the wheels");}
        },
        PREWASH{
            void action(){print("Loosening the dirt");}
        },
        BASIC{
            void action(){print("The basic wash");}
        },
        HOTWAX{
            void action(){print("Applying hot wax");}
        },
        RINSE{
            void action(){print("Rinsing");}
        },
        BLOWDRY{
            void action(){print("Blowing dry");}
        };
        abstract void action();
    }
    EnumSet<Cycle> cycles =
            EnumSet.of(Cycle.BASIC, Cycle.RINSE);
    public void add(Cycle cycle){cycles.add(cycle);}
    public void washCar(){
        for(Cycle c: cycles)
            c.action();
    }
    public String toString(){return  cycles.toString();}

    public static void main(String[] args) {
        CarWash wash = new CarWash();
        print(wash);
        wash.washCar();
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HOTWAX);
        print(wash);
        wash.washCar();
    }
}
