package org.example.SecondProject;

public class Herbivore extends Creature{


    public Herbivore(int velocity, int hp) {
        super(velocity, hp);
    }

    @Override
    public String makeMove(int [][] worldMap) {
        for(int i = 0; i < worldMap.length; i++){
            for(int j = 0; j < worldMap[i].length; j++){
                if(worldMap[i][j] == 1 && ((i + 2) < worldMap.length && worldMap[i+2][j] == 0)){
                    worldMap[i+2][j] = 1;
                    worldMap[i][j] = 0;
                    return "Herbivore made step";
                }
                else if(worldMap[i][j] == 1 && ((j + 2) < worldMap[i].length && worldMap[i][j+2] == 0)){
                    worldMap[i][j+2] = 1;
                    worldMap[i][j] = 0;
                    return "Herbivore made step";

                }

                else if(worldMap[i][j] == 1 && ((i - 2) >= 0 && worldMap[i-2][j] == 0)){
                    worldMap[i-2][j] = 1;
                    worldMap[i][j] = 0;
                    return "Herbivore made step";
                }
                else if(worldMap[i][j] == 1 && ((j - 2) >= 0 && worldMap[i][j-2] == 0)){
                    worldMap[i][j-2] = 1;
                    worldMap[i][j] = 0;
                    return "Herbivore made step";
                }


            }
        }

        return "Herbivore can't move";
    }


    public void checkGrass(int [][] worldMap){
        Grass grass = new Grass();
        for(int i = 0; i < worldMap.length; i++){
            for(int j = 0; j < worldMap[i].length; j++){
                if(worldMap[i][j] == this.number() && ((i < worldMap.length - 1 && worldMap[i + 1][j] == grass.number()))){
                    eat();
                    worldMap[i+1][j] = this.number();
                    worldMap[i][j] = 0;
                }
                if(worldMap[i][j] == this.number() && i > 0 && worldMap[i-1][j] == grass.number()){
                    eat();
                    worldMap[i-1][j] = this.number();
                    worldMap[i][j] = 0;
                }
                if(worldMap[i][j] == this.number() && j > worldMap[i].length - 1 && worldMap[i][j+1] == grass.number()){
                    eat();
                    worldMap[i][j+1] = this.number();
                    worldMap[i][j] = 0;
                }
                if(worldMap[i][j] == this.number() && j > 0 && worldMap[i][j-1] == grass.number()){
                    eat();
                    worldMap[i][j-1] = this.number();
                    worldMap[i][j] = 0;
                }
            }
        }

    }
    public void eat(){
        System.out.println("The herbivore has eaten a grass");
        if(this.getHp() + 15 >= 100){
            this.setHp(100);
        }
        else
            this.setHp(this.getHp() + 15);

    }

    public int number() {
        return 1;
    }




}
