package main.refactor;

public class Main {

    public static void main(String[] args) {

        Fighter player = new Fighter("Yahya");
        Fighter enemy = new Fighter("Linus");

        BattleService battleService = new BattleService();

        battleService.attack(player, enemy);
        battleService.attack(enemy, player);

        battleService.heal(player);


    }

}
