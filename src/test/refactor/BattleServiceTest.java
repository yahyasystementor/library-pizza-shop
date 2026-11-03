package test.refactor;

import main.refactor.BattleService;
import main.refactor.Fighter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BattleServiceTest {

    private BattleService battleService;
    private Fighter player;
    private Fighter enemy;

    @BeforeEach
    void setUp(){
        battleService = new BattleService();
        player = new Fighter("Orc");
        enemy = new Fighter("Mage");
    }

    @Test
    void attackShouldAlwaysReduceHpBy10(){
        // Act
        battleService.attack(player,enemy);

        // Assert
        assertEquals(90, enemy.getHp());

    }

    @Test
    void attackShouldNeverReduceHpBelow0(){
        // Arrange
        enemy.setHp(5);

        // Act
        battleService.attack(player, enemy);
        // Assert
        assertEquals(0, enemy.getHp());

    }



}


