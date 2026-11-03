package main.refactor;

public class Fighter {
    private static final int ATTACK_DAMAGE = 10;
    private static final int MINIMAL_HP = 0;


    private String name;
    private int hp;

    public Fighter(String name) {
        this.name = name;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void takeDamage(int damage){
        hp = hp - damage;
        if(hp < MINIMAL_HP)  {
            hp = MINIMAL_HP;
        }
    }
}
