package org.example.SecondProject;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private int[][] worldMap = new int[7][7];
    private final int COUNTER = 6;
    private Predator predator = new Predator(2, 1, 99);
    private Herbivore herbivore = new Herbivore(2, 100);
    private Grass grass = new Grass();
    private Tree tree = new Tree();
    private Rock rock = new Rock();


    public void makeRender(){
        for(int i = 0; i < worldMap.length; i++){
            for(int j = 0; j < worldMap[i].length; j++){
                System.out.print(worldMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void startSimulation(){
        Actions actions = new Actions();
        actions.initActions(worldMap);
        int n = 0;
        while(n != 15){
            makeRender();
            actions.turnActions(worldMap);
            n++;
        }

    }


    public Predator getPredator() {
        return predator;
    }

    public void setPredator(Predator predator) {
        this.predator = predator;
    }

    public Herbivore getHerbivore() {
        return herbivore;
    }

    public void setHerbivore(Herbivore herbivore) {
        this.herbivore = herbivore;
    }

    public Grass getGrass() {
        return grass;
    }

    public void setGrass(Grass grass) {
        this.grass = grass;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public Rock getRock() {
        return rock;
    }

    public void setRock(Rock rock) {
        this.rock = rock;
    }

    public int getCOUNTER() {
        return COUNTER;
    }
}
