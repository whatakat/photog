package com.bignerdranch.testphilosophyjava.homecontrol.enumerations.rockScissorsPaper;

public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
