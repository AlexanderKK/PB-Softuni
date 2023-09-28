package PersonalExercise;

public class _04CatCaring {
    public static void main(String[] args) {
        int norm = 13000;
        
        double minutesPerDay = norm / 365.0;
        int minutesRounded = (int)(Math.ceil(minutesPerDay));
        
        int hours = minutesRounded / 60;
        int minutes = minutesRounded % 60;

        System.out.printf("%d : %02d", hours, minutes);
    }
}