package com.company.ControlFlow;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number, guess,tries = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Upper range: ");
        int interval = sc.nextInt();
        number = (int) (Math.random()* interval) + 1;

        do {
            System.out.println("Guess the number");
            guess = sc.nextInt();
            tries++;

            if (guess > number){
                System.out.println("You Guessed High Number");

            }else if (guess < number){
                System.out.println("You Guessed Low Number");

            }else {
                System.out.println("You guessed the Correct Number in :"+tries+" Tries");
            }
        }while (guess != number);
    }
}
