package org.example.FirstProject;

import java.util.Random;
import java.util.Scanner;

public class Person {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public void createWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Create the word: ");
        String word = scanner.nextLine();
        setWord(word);
    }
}
