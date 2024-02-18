package org.example.FirstProject;

import java.util.Scanner;

public class Game {
    public static void playGame(){
        HangmanGame hangmanGame = new HangmanGame();
        Scanner scanner = new Scanner(System.in);
        String start = "Start the new game";
        String end = "Exit";
        System.out.println(start);
        System.out.println(end);
        int choose = scanner.nextInt();
        if(choose == 1){
            hangmanGame.start();
        }
        else if (choose == 2){
            hangmanGame.exit();
        }
        else
            System.out.println("Please write digits 1 or 2");
    }
}
