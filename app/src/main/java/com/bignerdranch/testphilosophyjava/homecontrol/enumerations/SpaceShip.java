package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;
    public String toString(){
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for (SpaceShip s : values()){
            print(s);
        }
    }
}
