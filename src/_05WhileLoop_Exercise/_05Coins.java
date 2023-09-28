package _05WhileLoop_Exercise;

import java.util.Scanner;

public class _05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double changeInCoins = Math.round(change * 100);
        int pennies = 0;

        while(changeInCoins > 0) {
            if(changeInCoins >= 200) {
                pennies++;
                changeInCoins -= 200;
            } else if(changeInCoins >= 100) {
                pennies++;
                changeInCoins -= 100;
            } else if(changeInCoins >= 50) {
                pennies++;
                changeInCoins -= 50;
            } else if(changeInCoins >= 20) {
                pennies++;
                changeInCoins -= 20;
            } else if(changeInCoins >= 10) {
                pennies++;
                changeInCoins -= 10;
            } else if(changeInCoins >= 5) {
                pennies++;
                changeInCoins -= 5;
            } else if(changeInCoins >= 2) {
                pennies++;
                changeInCoins -= 2;
            } else if(changeInCoins >= 1) {
                pennies++;
                changeInCoins -= 1;
            } /* else {
                break;
            } */
        }
        System.out.println(pennies);
    }
}