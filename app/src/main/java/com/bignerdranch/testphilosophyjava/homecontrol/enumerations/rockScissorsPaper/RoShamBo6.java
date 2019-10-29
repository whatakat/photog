package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper;

import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.DRAW;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.LOSE;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.WIN;

public enum RoShamBo6 implements Competitor<RoShamBo6> {
    PAPER, SCISSORS, ROCK;
    private static Outcome[][] table = {
            {DRAW, LOSE, WIN},
            {WIN, DRAW, LOSE},
            {LOSE, WIN, DRAW},
    };
    public Outcome compete(RoShamBo6 other){
        return table[this.ordinal()][this.ordinal()];
    }

    public static void main(String[] args) {
        RoShambo.play(RoShamBo6.class, 20);
    }
}
