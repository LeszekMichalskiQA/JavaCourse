package CodingChallenges;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 365 / 24 / 60;
            long days = minutes / 24 / 60 % 365;
            System.out.printf("%d min = %d y and %d d%n", minutes, years, days);
        }
    }
}
