package main.tdd;

import java.util.Random;

public class Fighter {

    public int attack(){
        Random random = new Random();
        return random.nextInt(6,16);
    }
}
