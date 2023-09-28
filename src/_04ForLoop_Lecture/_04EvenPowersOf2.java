package _04ForLoop_Lecture;

import java.util.Scanner;

public class _04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exponent = Integer.parseInt(scanner.nextLine());

//        for (int i = 0; i <= exponent; i++) {
//            if(i % 2 == 0) {
//                System.out.println((int)Math.pow(2, i));
//            }
//        }

        int num = 1;
        for (int i = 0; i <= exponent; i+=2) {
            System.out.println(num);
            num = num * 2 * 2;
        }
    }
}