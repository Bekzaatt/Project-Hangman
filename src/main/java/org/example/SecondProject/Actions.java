package org.example.SecondProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Actions {
    private Simulation simulation = new Simulation();
    public void initActions(int[][] worldMap) {
        List<Entity> entities = new ArrayList<>();
        entities.add(simulation.getHerbivore());
        entities.add(simulation.getPredator());
        entities.add(simulation.getRock());
        entities.add(simulation.getGrass());
        entities.add(simulation.getTree());

        int counter = 0;
        Random random = new Random();
        while (counter != 5) {
            int x = random.nextInt(worldMap.length);
            int y = random.nextInt(worldMap[0].length);

            if (x > 0 && x < worldMap.length - 1 && worldMap[x][y] == 0 && worldMap[x - 1][y] == 0 && worldMap[x+1][y] == 0
                && y > 0 && y < worldMap[x].length - 1 && worldMap[x][y-1] == 0 && worldMap[x][y+1] == 0
                    && worldMap[x - 1][y-1] == 0 && worldMap[x+1][y+1] == 0 && worldMap[x-1][y+1] == 0 && worldMap[x+1][y-1]==0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }
            else if(x == 0 && y > 0 && y < worldMap[x].length - 1 && worldMap[x][y] == 0 && worldMap[x+1][y] == 0 && worldMap[x][y+1] == 0 && worldMap[x][y-1]==0
                    && worldMap[x+1][y+1] == 0 && worldMap[x+1][y-1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }
            else if (x == worldMap.length - 1 && y != worldMap.length - 1 && y != 0 && worldMap[x][y] == 0 && worldMap[x - 1][y] == 0 && worldMap[x][y+1] == 0 && worldMap[x][y-1]==0
                    && worldMap[x-1][y+1] == 0 && worldMap[x-1][y-1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }
            else if (y == 0 && x != worldMap.length - 1 && x!=0 && worldMap[x][y] == 0 && worldMap[x+1][y] == 0 && worldMap[x][y+1] == 0 && worldMap[x - 1][y]==0
                    && worldMap[x+1][y+1] == 0 && worldMap[x-1][y+1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }
            else if(y == worldMap.length - 1 && x != worldMap.length - 1 && x!=0 && worldMap[x][y] == 0 && worldMap[x+1][y] == 0 && worldMap[x - 1][y] == 0 && worldMap[x][y - 1]==0
                    && worldMap[x+1][y-1] == 0 && worldMap[x-1][y-1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }

            else if(x == 0 && y == 0 && worldMap[x][y] == 0 && worldMap[x + 1][y] == 0 && worldMap[x][y+1] == 0
                    && worldMap[x+1][y+1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }
            else if(x == 0 && y == worldMap.length - 1 && worldMap[x][y] == 0 && worldMap[x + 1][y] == 0 && worldMap[x][y-1] == 0
                    && worldMap[x+1][y-1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }
            else if(y == 0 && x == worldMap.length - 1 && worldMap[x][y] == 0 && worldMap[x - 1][y] == 0 && worldMap[x][y+1] == 0
                    && worldMap[x-1][y+1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }
            else if(x == worldMap.length - 1 && y == worldMap.length - 1 && worldMap[x][y] == 0 && worldMap[x - 1][y] == 0 && worldMap[x][y-1] == 0
                    && worldMap[x-1][y-1] == 0){
                worldMap[x][y] = entities.get(counter).number();
                counter++;
            }


        }
    }


    public void turnActions(int [][] worldMap) {

        List<Entity> entities = new ArrayList<>();

        entities.add(simulation.getHerbivore());
        entities.add(simulation.getPredator());
        entities.add(simulation.getTree());
        entities.add(simulation.getGrass());
        entities.add(simulation.getRock());


        for(int i = 0; i < entities.size(); i++){
            String res = entities.get(i).makeMove(worldMap);
            System.out.println(res);

        }
        simulation.getHerbivore().checkGrass(worldMap);
        simulation.getPredator().checkMeal(worldMap, simulation.getHerbivore());

    }
}