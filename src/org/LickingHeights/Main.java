package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        int PickedNumber;


        for (int h = 4; h < 30; h++) {
            PickedNumber = (int) (Math.random() * 19);
            System.out.println(PickedNumber);


            do {

                System.out.println("Do you want to keep going?");
                answer = keyboard.nextLine().toLowerCase();
            } while (answer.equals("yes"));




            }

        }
    }

