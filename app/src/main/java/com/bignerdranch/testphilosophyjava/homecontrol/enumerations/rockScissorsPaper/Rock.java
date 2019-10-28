package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper;

import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.DRAW;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.LOSE;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.WIN;

public class Rock implements Item {
    @Override
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) {
        return WIN;
    }

    @Override
    public Outcome eval(Scissors s) {
        return LOSE;
    }

    @Override
    public Outcome eval(Rock r) {
        return DRAW;
    }
    public String toString(){return "Rock";}
}
