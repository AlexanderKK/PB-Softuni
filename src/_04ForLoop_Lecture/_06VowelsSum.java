package _04ForLoop_Lecture;

import java.util.Scanner;

public class _06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            switch (letter) {
                case 'a':
                    sumVowels += 1;
                    break;
                case 'e':
                    sumVowels += 2;
                    break;
                case 'i':
                    sumVowels += 3;
                    break;
                case 'o':
                    sumVowels += 4;
                    break;
                case 'u':
                    sumVowels += 5;
                    break;
            }
        }
        System.out.println(sumVowels);
    }
}