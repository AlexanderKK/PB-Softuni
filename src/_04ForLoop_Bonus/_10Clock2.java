package _04ForLoop_Bonus;

public class _10Clock2 {
    public static void main(String[] args) {
        int time = 24 * 60 * 60;

        for (int i = 0; i < time; i++) {
            int hours = i / (60 * 60);
            int minutes = i % (60 * 60);
            int seconds = i % 60;

            System.out.printf("%d : %d : %d%n", hours, minutes, seconds);
        }

//        for (int i = 0; i < 24; i++) {
//            for (int j = 0; j < 60; j++) {
//                for (int k = 0; k < 60; k++) {
//                    System.out.printf("%d : %d : %d%n", i, j, k);
//                }
//            }
//        }
    }
}