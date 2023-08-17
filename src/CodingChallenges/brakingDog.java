package CodingChallenges;

import utils.Generator;

public class brakingDog {
    public static void main(String[] args) {
        boolean barking = false;
        shouldWakeUp(barking, Generator.getRandomInt(0, 0));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        System.out.println(hourOfTheDay);
        if (!barking) {
            System.out.println(barking);
            return false;  // If dog isn't barking, no need to check the hour.
        }
        System.out.println(hourOfTheDay);
        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            barking = false;
        } else barking = hourOfTheDay < 8 || hourOfTheDay > 22;
        System.out.println(barking);
        return barking;
    }
}
