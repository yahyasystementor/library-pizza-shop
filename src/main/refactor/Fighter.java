package main.refactor;

public class Fighter {

    private String name;
    private int hp;

    public Fighter(String name) {
        this.name = name;
        this.hp = FighterStats.MAX_HP.getValue();
    }

    public void takeDamage(int damage ){
        setHp(getHp() - damage);
    }

    public int giveDamage(){
        return FighterStats.ATTACK_DAMAGE.getValue();
    }

    public void healFighter(int healAmount){
        setHp (getHp() + healAmount);
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
        if (hp> FighterStats.MAX_HP.getValue()){
            this.hp = FighterStats.MAX_HP.getValue();
        } else if (hp < FighterStats.MIN_HP.getValue()) {
            this.hp = FighterStats.MIN_HP.getValue();
        } else {
            this.hp = hp;
        }
    }

    public boolean isAlive(){
        return hp > 0;
    }

}
