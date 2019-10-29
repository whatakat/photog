package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper;


import static com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper.Outcome.*;

public enum RoShamBo3 implements Competitor<RoShamBo3> {
    PAPER{
        @Override
        public Outcome compete(RoShamBo3 it){
            switch (it){
                default:
                case PAPER:return DRAW;
                case SCISSORS: return LOSE;
                case ROCK: return WIN;
            }
        }
    },
    SCISSORS{
        @Override
        public Outcome compete(RoShamBo3 it){
            switch (it){
                default:
                case PAPER: return WIN;
                case SCISSORS: return DRAW;
                case ROCK: return LOSE;
            }
        }
    },
    ROCK{
        @Override
        public Outcome compete(RoShamBo3 it) {
            switch (it){
                default:
                case PAPER: return LOSE;
                case SCISSORS: return WIN;
                case ROCK: return DRAW;
            }
        }
    };
    public abstract Outcome compete(RoShamBo3 it);

    public static void main(String[] args) {
        RoShambo.play(RoShamBo3.class, 20);
    }
}
