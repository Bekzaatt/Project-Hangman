package org.example.FirstProject;

import java.util.Scanner;

public class Player {
    public String sayLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say a letter");
        String letter = scanner.nextLine();
        while(letter.length() > 1){
            System.out.println("You can write only one letter");
            letter = scanner.nextLine();
        }
        return letter;
    }
}
