package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper;

public enum RoshamBo4 implements Competitor<RoshamBo4> {
    ROCK{
        @Override
        public Outcome compete(RoshamBo4 opponent) {
            return compete(SCISSORS,opponent);
        }
    },
    SCISSORS{
        @Override
        public Outcome compete(RoshamBo4 opponent) {
            return compete(PAPER, opponent);
        }
    },
    PAPER{
        @Override
        public Outcome compete(RoshamBo4 opponent) {
            return compete(ROCK, opponent);
        }
    };
    Outcome compete(RoshamBo4 loser, RoshamBo4 opponent){
        return ((opponent==this)?Outcome.DRAW
                :((opponent==loser)?Outcome.WIN
                :Outcome.LOSE));
    }

    public static void main(String[] args) {
        RoShambo.play(RoshamBo4.class, 20);
    }
}
