package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper;

import java.util.EnumMap;

import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.DRAW;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.LOSE;
import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.WIN;

public enum RoShambo5 implements Competitor<RoShambo5> {
    PAPER, SCISSORS, ROCK;
    static EnumMap<RoShambo5, EnumMap<RoShambo5, Outcome>>
    table = new EnumMap<RoShambo5, EnumMap<RoShambo5, Outcome>>(RoShambo5.class);
    static {
        for (RoShambo5 it : RoShambo5.values())
            table.put(it,
                    new EnumMap<RoShambo5, Outcome>(RoShambo5.class));
        initRow(PAPER, DRAW, LOSE, WIN);
        initRow(SCISSORS, WIN, DRAW, LOSE);
        initRow(ROCK, LOSE, WIN, DRAW);
    }static void initRow(RoShambo5 it,Outcome vPAPER, Outcome vSCISSORS, Outcome vROCK){
        EnumMap<RoShambo5, Outcome> row =RoShambo5.table.get(it);
        row.put(RoShambo5.PAPER, vPAPER);
        row.put(RoShambo5.SCISSORS, vSCISSORS);
        row.put(RoShambo5.ROCK,vROCK);
    }
    public Outcome compete(RoShambo5 it){
        return table.get(this).get(it);
    }

    public static void main(String[] args) {
        RoShambo.play(RoShambo5.class, 20);
    }

}
