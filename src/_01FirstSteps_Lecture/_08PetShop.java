package _01FirstSteps_Lecture;

import java.util.Scanner;

public class _08PetShop {
    public static void main(String[] args) {
        int dogs;
        int cats;
        double result;
        do {
            Scanner scanner = new Scanner(System.in);

            dogs = Integer.parseInt(scanner.nextLine());
            cats = Integer.parseInt(scanner.nextLine());

            double pricePerDog = 2.50;
            double pricePerCat = 4.00;

            double dogsTotal = dogs * pricePerDog;
            double catsTotal = cats * pricePerCat;

            result = dogsTotal + catsTotal;
        } while(dogs < 0 || dogs > 100 || cats < 0 || cats > 100);
        System.out.println(result + " lv.");
    }
}