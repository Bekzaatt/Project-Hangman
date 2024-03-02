package org.example.SecondProject;

public class Grass extends Entity{
    @Override
    public String makeMove(int[][] worldMap) {
        return "Grass";
    }

    public int number(){
        return 3;
    }
}
