package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int pickedNumber;

        for (int h = 0; h < 10; h++) {
            pickedNumber = (int) (Math.random() * 5) + 4;
            System.out.println(pickedNumber);
        }

    }
}
