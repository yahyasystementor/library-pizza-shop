package test.fighter;

import main.unittest.fighter.Fighter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FighterTest {


    @Test
    void attackShouldDoBetween5And15Damage(){
        // A Arrange
        Fighter fighter = new Fighter();

        int hpBeforeAttack = fighter.getHp();

        int damage = fighter.attack();

        assertTrue(damage >= 5 && damage <= 15);
        assertEquals(hpBeforeAttack - damage,fighter.getHp());
        assertEquals(5, fighter.getLowest());
        assertEquals(10, fighter.getHighest());
    }
}
