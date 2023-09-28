package _08JavaBook_Champs1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02MagicDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYear = Integer.parseInt(scanner.nextLine());
        int endYear = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());

        LocalDate currentDate = LocalDate.of(startYear, 1, 1);
        boolean isFound = false;

        while(currentDate.getYear() <= endYear) {
            int dayFirstDigit = currentDate.getDayOfMonth() / 10;
            int daySecondDigit = currentDate.getDayOfMonth() % 10;
            int monthFirstDigit = currentDate.getMonthValue() / 10;
            int monthSecondDigit = currentDate.getMonthValue() % 10;
            int yearFirstDigit = currentDate.getYear() / 1000;
            int yearSecondDigit = (currentDate.getYear() / 100) % 10;
            int yearThirdDigit = currentDate.getYear() / 10 % 10;
            int yearFourthDigit = currentDate.getYear() % 10;

//            System.out.printf("%d %d %d %d %d %d %d %d", dayFirstDigit, daySecondDigit, monthFirstDigit, monthSecondDigit, yearFirstDigit, yearSecondDigit, yearThirdDigit, yearFourthDigit);
            int dateWeight = dayFirstDigit * (daySecondDigit + monthFirstDigit + monthSecondDigit + yearFirstDigit + yearSecondDigit + yearThirdDigit + yearFourthDigit) +
                             daySecondDigit * (monthFirstDigit + monthSecondDigit + yearFirstDigit + yearSecondDigit + yearThirdDigit + yearFourthDigit) +
                             monthFirstDigit * (monthSecondDigit + yearFirstDigit + yearSecondDigit + yearThirdDigit + yearFourthDigit) +
                             monthSecondDigit * (yearFirstDigit + yearSecondDigit + yearThirdDigit + yearFourthDigit) +
                             yearFirstDigit * (yearSecondDigit + yearThirdDigit + yearFourthDigit) +
                             yearSecondDigit * (yearThirdDigit + yearFourthDigit) +
                             yearThirdDigit * yearFourthDigit;

            if(dateWeight == weight) {
                DateTimeFormatter output = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                System.out.println(output.format(currentDate));
                isFound = true;
            }

            currentDate = currentDate.plusDays(1);
        }

        if(!isFound) {
            System.out.println("No");
        }
    }
}