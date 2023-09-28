package _04ForLoop_Exercise;

public class _01NumbersEndingIn7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            boolean hasEndedWith7 = i % 10 == 7;

            if(hasEndedWith7) {
                System.out.println(i);
            }
        }
    }
}