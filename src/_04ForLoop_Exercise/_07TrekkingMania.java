package _04ForLoop_Exercise;

import java.util.Scanner;

public class _07TrekkingMania{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        String peak = "";
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sumAllPeople = 0;

        for(int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if(people <= 5) {
                peak = "Мусала";
                sum1 += people;
            } else if(people <= 12) {
                peak = "Монблан";
                sum2 += people;
            } else if(people <= 25) {
                peak = "Килиманджаро";
                sum3 += people;
            } else if(people <= 40) {
                peak = "К2";
                sum4 += people;
            } else {
                peak = "Еверест";
                sum5 += people;
            }

            sumAllPeople += people;
        }

        double p1 = (double)sum1 / sumAllPeople * 100;
        double p2 = (double)sum2 / sumAllPeople * 100;
        double p3 = (double)sum3 / sumAllPeople * 100;
        double p4 = (double)sum4 / sumAllPeople * 100;
        double p5 = (double)sum5 / sumAllPeople * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}