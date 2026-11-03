package main.refactor;

public class BattleService {

    public void attack(Fighter attacker, Fighter defender){
        int damage = 10;
        int newHp = defender.getHp() - damage;

        if (newHp < 0) {
            newHp = 0;
        }

        defender.setHp(newHp);

        System.out.println(attacker.getName() + " har attackerat " + defender.getName());
        System.out.println("Damage: " + damage);
        System.out.println(attacker.getName() + " HP " + attacker.getHp());
        System.out.println(defender.getName() + " HP " + defender.getHp());

        if (defender.getHp() == 0) {
            System.out.println(defender.getName() + " has been defeated");
        }
    }

    public void heal(Fighter fighter) {
        int healAmount = 10;

        int newHp = fighter.getHp() + healAmount;

        if (newHp > 100){
            newHp = 100;
        }
        fighter.setHp(newHp);

        System.out.println(fighter.getName() + "healed for " + healAmount);
        System.out.println(fighter.getHp() + " HP ");

    }




}
