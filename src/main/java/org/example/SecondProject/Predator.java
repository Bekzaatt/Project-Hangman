package org.example.SecondProject;

public class Predator extends Creature{
    private int amount_attack;

    public Predator(int velocity, int hp, int amount_attack) {
        super(velocity, hp);
        this.amount_attack = amount_attack;
    }

    @Override
    public String makeMove(int[][] worldMap){
        for(int i = 0; i < worldMap.length; i++){
            for(int j = 0; j < worldMap[i].length; j++){ // myna jerde 2 bolgan sebeby, indexter 0-den bastalady
                if(worldMap[i][j] == 2 && ((i + 3) < worldMap.length && worldMap[i+3][j] == 0)){ // 2, 1
                    worldMap[i+3][j] = this.number();
                    worldMap[i][j] = 0;
                    return "Predator made step";
                }

                else if(worldMap[i][j] == 2 && ((j + 3) < worldMap[i].length && worldMap[i][j+3] == 0)){
                    worldMap[i][j+3] = this.number();
                    worldMap[i][j] = 0;
                    return "Predator made step";
                }

                else if(worldMap[i][j] == 2 && ((i - 3) > -1 && worldMap[i-3][j] == 0)){
                    worldMap[i-3][j] = this.number();
                    worldMap[i][j] = 0;
                    return "Predator made step";
                }


                else if(worldMap[i][j] == 2 && ((j - 3) > -1 && worldMap[i][j-3] == 0)){
                    worldMap[i][j-3] = this.number();
                    worldMap[i][j] = 0;
                    return "Predator made step";

                }



            }
        }

        return "Predator can't move";
    }

    public void attack(Herbivore herbivore){
        if (herbivore.getHp() - amount_attack <= 0){
            herbivore.setHp(0);
        }
        else{
            herbivore.setHp(herbivore.getHp() - amount_attack);
            System.out.println("The hp of herbivore: " + herbivore.getHp());
        }


    }
    public void checkMeal(int[][] worldMap, Herbivore herbivore){
        for(int i = 0; i < worldMap.length; i++){
            for(int j = 0; j < worldMap[i].length; j++){
                if(herbivore.getHp() == 0 && worldMap[i][j] == herbivore.number()){
                    System.out.println("Herbivore was catched by predator");
                    System.out.println("The hp of herbivore: " + herbivore.getHp());
                    worldMap[i][j] = 0;
                }
                if(worldMap[i][j] == this.number() && ((i < worldMap.length - 1 && worldMap[i + 1][j] == herbivore.number())
                    || (i > 0 && worldMap[i-1][j] == herbivore.number())
                    || (j > worldMap[i].length - 1 && worldMap[i][j+1] == herbivore.number())
                    || (j > 0 && worldMap[i][j-1] == herbivore.number()))){
                    attack(herbivore);
                }


            }
        }
    }

    public int number(){
        return 2;
    }



    public int getAmount_attack() {
        return amount_attack;
    }
    public void setAmount_attack(int amount_attack) {
        this.amount_attack = amount_attack;
    }


}
