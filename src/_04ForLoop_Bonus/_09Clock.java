package _04ForLoop_Bonus;

public class _09Clock {
    public static void main(String[] args) {
        int time = 24 * 60 * 60;

        for (int i = time - 1; i >= 0; i--) {
            int hours = i / 3600;
            int minutes = i % 3600 / 60;
            int seconds = i % 3600 % 60;
            System.out.printf("%02d : %02d : %02d%n", hours, minutes, seconds);
        }

//        int time = 24 * 60;
//
//        for (int i = 0; i < time; i++) {
//            int hours = i / 60;
//            int minutes = i % 60;
//            System.out.printf("%d : %d%n", hours, minutes);
//        }

//        for (int i = 0; i < 24; i++) {
//            for (int j = 0; j < 60; j++) {
//                System.out.printf("%d : %d%n", i , j);
//            }
//        }
    }
}