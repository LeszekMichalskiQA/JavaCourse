package CodingChallenges;

import utils.Generator;
import utils.LoggerUtil;

public class SpeedConverter {
    public static void main(String[] args) {
        double kilometers = Generator.getRandomDouble(-120, 240);
        printConversion(kilometers);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            return -1;
        }
        return Math.round(kilometersPerHour * 0.621371192);
    }

    public static void printConversion(double kilometersPerHour) {
        if (isPositive(kilometersPerHour)) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/H = " + milesPerHour + "mi/h");
        } else {
            System.out.println("Invalid value");
        }
    }
    private static boolean isPositive(double value) {
        return (value >= 0);
    }
}
