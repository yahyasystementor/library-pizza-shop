package main.unittest.fighter;

import java.util.Random;

public class Fighter {

    private int hp = 100;

    private Random random =  new Random();

    public int getHp() {
        return hp;
    }

    public void attack(){
        int damage = random.nextInt(5,15);

        hp = hp - damage;
    }


}
