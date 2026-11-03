package main.refactor;

public enum FighterStats {
    HEAL_AMOUNT(10),
    MAX_HP(100),
    MIN_HP(0),
    ATTACK_DAMAGE(10);

    int value;
    FighterStats(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
