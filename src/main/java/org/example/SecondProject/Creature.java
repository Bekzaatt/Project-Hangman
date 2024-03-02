package org.example.SecondProject;

public class Creature extends Entity{
    private int velocity;
    private int hp;


    public Creature(int velocity, int hp) {
        this.velocity = velocity;
        this.hp = hp;
    }

    @Override
    public String makeMove(int[][] worldMap) {
        return null;
    }

    @Override
    public int number() {
        return 0;
    }


    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp <= 0){
            this.hp = 0;
        }else if(hp >= 100){
            this.hp = 100;
        }else
            this.hp = hp;
    }
}
