package DateAndTime;

import java.time.LocalDate;
import java.util.Calendar;

public class Result {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        int month = 5;
        int day = 3;
        int year = 2021;

        System.out.println(findDay(month, day, year));

    }
}
