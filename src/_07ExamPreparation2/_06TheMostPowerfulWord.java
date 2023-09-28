package _07ExamPreparation2;

import java.util.Scanner;

public class _06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String strongestWord = "";
        int max = Integer.MIN_VALUE;

        while(!input.equals("End of words")) {

            int total = 0;
            String word = input;
            for (int i = 0; i < word.length(); i++) {
                total += word.charAt(i);
            }

            String vowels = "aeiouy";
            char firstLetter = word.toLowerCase().charAt(0);
            boolean isPresent = false;

            for (int i = 0; i < vowels.length(); i++) {
                if(firstLetter == vowels.charAt(i)) {
                    isPresent = true;
                }
            }
            if(isPresent) {
                total *= word.length();
            } else {
                total = (int)Math.floor(1.0 * total / word.length());
            }

            if(total > max) {
                max = total;
                strongestWord = word;
            }

            input = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d", strongestWord, max);
    }
}