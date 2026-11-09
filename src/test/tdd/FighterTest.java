package test.tdd;

import main.tdd.Fighter;
import main.tdd.calc.DamageCalculator;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class FighterTest {
/*
    @Test
    void attackShouldReturnDamageValue(){
        Fighter fighter = new Fighter();
        for (int i = 0; i < 100000; i++) {
            int damage = fighter.attack();
            assertTrue(damage >= 5 && damage <= 15);
        }
    }
 */

    @Test
    void shouldReturnMinimumDamage(){
        DamageCalculator calculator = new DamageCalculator(new FixedRandom(0));

        assertEquals(5, calculator.rollDamage());
    }


    @Test
    void shouldReturnMaximumDamage(){
        DamageCalculator calculator = new DamageCalculator(new FixedRandom(10));

        assertEquals(15, calculator.rollDamage());
    }


    @Test
    void shouldReturnMidDamage(){
        DamageCalculator calculator = new DamageCalculator(new FixedRandom(5));

        assertEquals(10, calculator.rollDamage());
    }

    static class FixedRandom extends Random{

        private final  int value;

        FixedRandom(int value) {
            this.value = value;
        }


        @Override
        public int nextInt(int bound){
            assertEquals(11, bound);
            return value;
        }
    }
}


/*

 */

