package com.bignerdranch.testphilosophyjava.homecontrol.homecontrol;

public class Terminate extends Event {
    public Terminate(long delyTime){super(delyTime);}
    public void action(){System.exit(0);}
    public String toString(){return "switch off";}
}
