package org.benjaminsinzore.fundamentals.enums;

public enum Cereals {

    CAPTAIN_CRUNCH(70, "JAN - 20TH 1997"),
    FRUIT_LOOPS(80, "FEB - 3DR 1997"),
    REESE_PUFFS(50, "SEP - 21ST 1997"),
    COCOA_PUFFS(30, "JUN - 30TH 1997");

    final int levelOfDeliciousness;
    final String asOf;

    Cereals (int levelOfDeliciousness, String asOf){
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.asOf = asOf;
    }
}
