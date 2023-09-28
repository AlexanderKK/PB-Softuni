package _04ForLoop_Bonus;

import java.util.*;

public class _01BackToThePast{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double heritage = Double.parseDouble(scanner.nextLine());
        int lastYear = Integer.parseInt(scanner.nextLine());
        int ageCounter = 0;

        for(int i = 1800; i <= lastYear; i++) {
            if(i % 2 == 0) {
                heritage -= 12000;
            } else {
                heritage -= 12000 + 50 * (18 + ageCounter);
            }
            ageCounter++;
        }

        if(heritage < 0) {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(heritage));
        } else {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", heritage);
        }
    }
}