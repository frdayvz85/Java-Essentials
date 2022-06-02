package Enums;

public enum Cereals {
    CAPATAIN_CRUNCH(40),
    FROOT_LOOPS(60),
    REESES_PUFFS(85),
    COCOA_PUFFS(70);

    // int levelOfDeliciousness;
    final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }

}
