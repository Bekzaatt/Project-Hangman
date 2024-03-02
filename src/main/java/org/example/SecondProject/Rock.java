package org.example.SecondProject;

public class Rock extends Entity{
    @Override
    public String makeMove(int [][] worldMap) {
        return "Rock";
    }
    public int number(){
        return 4;
    }
}
