package main.tdd.calc;

import java.util.Random;

public class DamageCalculator {



    private final Random random;

    public DamageCalculator(Random random) {
        this.random = random;
    }

    public int rollDamage(){
        return random.nextInt(11) + 5;
    }
}
