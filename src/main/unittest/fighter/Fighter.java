package main.unittest.fighter;

import java.util.Random;

public class Fighter {

    private int hp = 100;
    private int lowest = 5;
    private int highest = 10;


    public int getLowest() {
        return lowest;
    }

    public int getHighest() {
        return highest;
    }

    private Random random =  new Random();

    public int getHp() {
        return hp;
    }

    public int attack(){
        int damage = random.nextInt(highest)+ lowest;

        hp = hp - damage;

        return damage;
    }


}
