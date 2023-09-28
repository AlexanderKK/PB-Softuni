package UE_VarnaCompetition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class _02Weekend {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String startLine = scanner.nextLine();
        String endLine = scanner.nextLine();

        String[] split1, split2;
        split1 = startLine.split("\\.");
        split2 = endLine.split("\\.");

        String str1 = "";
        String str2 = "";

        for (int i = split1.length - 1; i >= 0; i--) {
            str1 += split1[i] + "-";
        }
        for (int i = split2.length - 1; i >= 0; i--) {
            str2 += split2[i] + "-";
        }
        str1 = str1.substring(0, str1.length() - 1);
        str2 = str2.substring(0, str2.length() - 1);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = formatter.parse(str1);
        Date endDate = formatter.parse(str2);

        LocalDate start = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if(start.compareTo(end) > 0) {
            System.out.println(0);
        } else {
            int weekendCount = 0;
            for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
                // Do your job here with `date`.
                int weekday = date.getDayOfWeek().getValue();
                boolean isWeekend = weekday == 6 || weekday == 7;

                if(isWeekend) {
    //                System.out.println(date.getDayOfWeek());
    //                System.out.println(date);

                    weekendCount++;
                }
            }
            System.out.println(weekendCount);
        }
    }
}