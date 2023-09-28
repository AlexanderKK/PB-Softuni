package _07ExamPreparation6;

import java.util.Scanner;

public class _01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        //2.	Количество на бананите в килограми – реално число в интервала [0.00 … 1 0000.00]
        //3.	Количество на портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        //4.	Количество на малините в килограми – реално число в интервала [0.00 … 10000.00]
        //5.	Количество на ягодите в килограми – реално число в интервала [0.00 … 10000.00]

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKgs = Double.parseDouble(scanner.nextLine());
        double orangesKgs = Double.parseDouble(scanner.nextLine());
        double raspberriesKgs = Double.parseDouble(scanner.nextLine());
        double strawberriesKgs = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * .6;
        double bananasPrice = raspberriesPrice * .2;

        double strawberriesTotal = strawberriesPrice * strawberriesKgs;
        double raspberryTotal = raspberriesPrice * raspberriesKgs;
        double orangesTotal = orangesPrice * orangesKgs;
        double bananasTotal = bananasPrice * bananasKgs;

        double totalCost = strawberriesTotal + raspberryTotal + orangesTotal + bananasTotal;

        System.out.printf("%.2f", totalCost);
    }
}