package CodingChallenges;

import utils.Generator;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year = Generator.getRandomInt(1, 9999);
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        System.out.println(year);
        return year >= 1 && year <= 9999 && (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        int daysForMonths;
        switch (month) {
            case 11, 4, 6, 9 -> daysForMonths = 30;
            case 2 -> daysForMonths = isLeapYear(year) ? 29 : 28;
            default -> daysForMonths = 31;
        }
        return daysForMonths;
    }
}

