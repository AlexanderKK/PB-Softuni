package _08JavaBook_Champs1;

import java.util.Scanner;

public class _03FiveSpecialLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        if (start < 10000 && end < 10000) {
            String result = "";
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        for (int l = 0; l < 5; l++) {
                            for (int m = 0; m < 5; m++) {
                                String pattern = "abcde";
                                String fullWord = "" + pattern.charAt(i) + pattern.charAt(j) + pattern.charAt(k) + pattern.charAt(l) + pattern.charAt(m);

                                String word = "";
                                for (int n = 0; n < fullWord.length(); n++) {
                                    if (fullWord.indexOf(fullWord.charAt(n)) == n) {
                                        word += fullWord.charAt(n);
                                    }
                                }

                                int weight = 0;
                                for (int n = 0; n < word.length(); n++) {
                                    int multiplier = n + 1; //abc
                                    weight += weight(word.charAt(n)) * multiplier;
                                }

                                if (weight >= start && weight <= end) {
                                    result += fullWord + " ";
                                }
                            }
                        }
                    }
                }
            }

            if (result.equals("")) {
                System.out.println("No");
            } else {
                System.out.println(result.trim());
            }
        }
    }

    static int weight(char ch) {
        int result = 0;
        switch (ch) {
            case 'a': result = 5; break;
            case 'b': result = -12; break;
            case 'c': result = 47; break;
            case 'd': result = 7; break;
            case 'e': result = -32; break;
        }
        return result;
    }
}