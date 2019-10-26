package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public enum OzWitch {
    WEST("Miss Gulch, aka the Wicked witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby "+
            "Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");
    private String description;
    private OzWitch(String description){
        this.description = description;
    }
    public String getDescription(){return description;}

    public static void main(String[] args) {
        for (OzWitch witch: OzWitch.values())
            print(witch+": "+witch.getDescription());
    }
}
