package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        double number;

        System.out.println("Pick a number");
        number = keyboard.nextDouble();

        int pickedNumber;


        for (int h = 0; h < 10; h++) {
            pickedNumber = (int) (Math.random() * 5) + 4;
            System.out.println(pickedNumber);


            do {
                System.out.println("I am inside the do while loop");
            } while (0 < 10);


            if (10 >= number && number > 0) {
                System.out.println("You win");
            } else if (20 >= number && number > 10) {
                System.out.println("You lose");
            }




















