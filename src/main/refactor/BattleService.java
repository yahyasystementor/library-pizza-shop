package main.refactor;

public class BattleService {

    private static final int ATTACK_DAMAGE = 10;
    private static final int MINIMAL_HP = 0;




    public void attack(Fighter attacker, Fighter defender){
        int damage = ATTACK_DAMAGE;

        defender.takeDamage(damage);
        printAttackResults(attacker,defender,damage);

        if (defender.getHp() == MINIMAL_HP) {
            System.out.println(defender.getName() + " has been defeated");
        }
    }

    private void printAttackResults(Fighter attacker, Fighter defender, int damage){
        System.out.println(attacker.getName() + " har attackerat " + defender.getName());
        System.out.println("Damage: " + damage);
        System.out.println(attacker.getName() + " HP " + attacker.getHp());
        System.out.println(defender.getName() + " HP " + defender.getHp());

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
