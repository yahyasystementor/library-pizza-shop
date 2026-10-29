package test.fighter;

import main.unittest.fighter.Fighter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FighterTest {


    @Test
    void attackShouldDoBetween5And15Damage(){
        // A Arrange
        Fighter fighter = new Fighter();

        int hpBeforeAttack =  fighter.getHp();


        // A Act
        fighter.attack();
        // Assert

        int hpAfterAttack = fighter.getHp();

        int damage = hpBeforeAttack - hpAfterAttack;

        assertTrue(damage >= 5);
        assertTrue(damage <= 15);


    }
}
