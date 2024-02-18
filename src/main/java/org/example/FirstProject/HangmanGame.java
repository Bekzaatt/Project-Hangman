package org.example.FirstProject;

import java.util.Arrays;

public class HangmanGame {

    private final static int MAX_NUMBER = 6;
    private int counter = 1;
    private Person person = new Person();
    private Player player = new Player();

    public void start(){
        gameProcess();
    }
    public void exit(){

    }

    public void gameProcess(){
        person.createWord();
        String guessWord = person.getWord();
        char[] letters = new char[guessWord.length()];

        while (true) {
            String letter = player.sayLetter();
            int index = 0;
            while (guessWord.indexOf(letter, index) > -1) {
                int tmp_index = guessWord.indexOf(letter, index);
                letters[tmp_index] = guessWord.charAt(tmp_index);
                index = tmp_index + 1;
            }
            if (!guessWord.contains(letter)) {
                counter++;
            }
            System.out.println(counter);
            String temp_word = String.valueOf(letters);

            if (temp_word.equals(guessWord)) {
                System.out.println("Congratulations!!! You won.");
                System.out.println("The word: " + temp_word);
                break;
            }
            if(counter == MAX_NUMBER){
                System.out.println("The game is over. You've lost");
                System.out.println("The word: " + guessWord);
                break;
            }
        }
        Game.playGame();
    }

}
