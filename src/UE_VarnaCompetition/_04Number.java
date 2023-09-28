package UE_VarnaCompetition;

import java.util.Scanner;

public class _04Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int diff;
        int minDiff = Integer.MAX_VALUE;
        int minDiff2;

        int value;
        int minValue = 0;

        if(a > 0 && a <= 100 && b > 0 && b <= 100 && c > 0 && c <= 10000) {
            int diff1,diff2,diff3,diff4;

            for (int i = a; i <= b; i += (b - a)) {
                diff1 = Math.abs((a + i) - c);
                diff2 = Math.abs((a * i) - c);

                if(diff1 < diff2) {
                    diff = diff1;
                    value = a + i;
                } else {
                    diff = diff2;
                    value = a * i;
                }

                if(diff < minDiff) {
                    minDiff = diff;
                    minValue = value;
                }

                if(a == b) {
                    break;
                }
            }
            diff3 = Math.abs((b + b) - c);
            diff4 = Math.abs((b * b) - c);
            if(diff3 < diff4) {
                minDiff2 = diff3;
                value = b + b;
            } else {
                minDiff2 = diff4;
                value = b * b;
            }
            if(minDiff2 < minDiff) {
                minDiff = minDiff2;
                minValue = value;
            }
            System.out.println(minValue);
        }
    }
}