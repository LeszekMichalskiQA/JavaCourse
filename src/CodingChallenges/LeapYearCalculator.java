package CodingChallenges;

import utils.Generator;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year = Generator.getRandomInt(1, 9999);
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        System.out.println(year);
        if (year >= 1 && year <= 9999) {
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                return true;
            }
        }
    return false;
    }
}
