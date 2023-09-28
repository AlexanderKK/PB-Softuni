package UE_VarnaCompetition;

import java.util.Scanner;

public class _05Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String palindrome = text;
        if(text.length() > 0 && text.length() < 500000) {
            for (int i = 0; i < text.length() / 2; i++) {
                palindrome += text.charAt(text.length() / 2 - i - 1);
            }
            System.out.println(palindrome);
            System.out.println(palindrome.length());
        }
    }
}