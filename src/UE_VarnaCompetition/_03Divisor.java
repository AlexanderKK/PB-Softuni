package UE_VarnaCompetition;

import java.util.ArrayList;
import java.util.Scanner;

public class _03Divisor {
//    public static ArrayList<Integer> factorize(int n, int primes) {
//        ArrayList<Integer> factors = new ArrayList<Integer>();
//        for (int i = 1; i <= primes; i++) {
//            if(i * i > n) {
//                break;
//            }
//            int j = 0;
//            while(n % i == 0) {
//                n /= i;
//                j += 1;
//            }
//            if(j > 0) {
//                factors.add(i, j);
//            }
//        }
//        if(n > 1) {
//            factors.add(n, 1);
//        }
//
//        return factors;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        int maxI = 0;
//        int maxJ = 0;
//
//        for (int i = 1; i <= n; i++) {
//            for (int k = 1; k <= n; k++) {
//                for (int j = k + 1; j <= n; j++) {
//                    if(k * j == n) {
//                        if(k > maxI) {
//                            maxI = k;
//                            maxJ = j;
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(maxI + " * " + maxJ);
//        int wanted = 0;
//        int divisors = 0;
//        for (int i = 1; i <= maxI; i++) {
//            for (int j = 1; j <= i; j++) {
//                if(i % j == 0) {
//                    divisors++;
//                }
//            }
//        }
//        for (int i = 1; i <= maxJ; i++) {
//            for (int j = 1; j <= i; j++) {
//                if(i % j == 0) {
//                    divisors++;
//                }
//            }
//        }
//        System.out.println(divisors);

        int maxDivisors = 0;
        int minNumber = 0;

        int temp = 0;
        if(n >= 1 && n <= 3000000) {
            int wantedNumber = 0;
            for (int i = 1; i <= n; i++) {
                int divisors = 0;

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisors++;
                    }
                }

                if (divisors > maxDivisors) {
                    maxDivisors = divisors;
                    if(temp == maxDivisors) {
                        if(i < minNumber) {
                            minNumber = i;
                            wantedNumber = minNumber;
                        }
                    } else {
                        wantedNumber = i;
                    }
                    temp = maxDivisors;
                }
            }
            System.out.println(wantedNumber);
            System.out.println(maxDivisors);
        }
    }
}