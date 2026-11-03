package main.refactor;

public class BattleService {


    public void attack(Fighter attacker, Fighter defender){
        int damage = attacker.giveDamage();
        defender.takeDamage(damage);
        printAttackResults(attacker,defender,damage);
        if (!defender.isAlive()) {
            System.out.println(defender.getName() + " has been defeated");
        }
    }

    private void printAttackResults(Fighter attacker, Fighter defender, int damage){
        System.out.println(attacker.getName() + " har attackerat " + defender.getName());
        System.out.println("Damage: " + damage);
        System.out.println(attacker.getName() + " HP " + attacker.getHp());
        System.out.println(defender.getName() + " HP " + defender.getHp());

    }

    /*
    TODO
    Refactor heal
     */


    public void heal(Fighter fighter) {
        fighter.healFighter(FighterStats.HEAL_AMOUNT.getValue());
        printHealMenu(fighter, FighterStats.HEAL_AMOUNT.getValue());
        if (fighter.getHp() == FighterStats.MAX_HP.getValue()) {
            System.out.println(fighter.getName() + " has been fully healed");
        }
    }


    private void printHealMenu(Fighter fighter, int healAmount) {
        System.out.println(fighter.getName() + " healed for " + healAmount);
        System.out.println(fighter.getHp() + " HP ");
    }




}
