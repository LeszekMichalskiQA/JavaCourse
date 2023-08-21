package CourseMaterial;

import utils.Generator;

import static utils.LoggerUtil.logInfo;

public class MethodOverloading {
    public static void main(String[] args) {
        int inches = Generator.getRandomInt(1, 60);
        int heightInFeet = Generator.getRandomInt(1, 10);
        int remainingHeightInInches = Generator.getRandomInt(1, 12);
        logInfo(String.format("%s inches equals %s cm", inches, convertToCentimeters(inches)));
        logInfo(String.format("%s feet and %s inches equals to %s cm",
                heightInFeet, remainingHeightInInches, convertToCentimeters(heightInFeet, remainingHeightInInches)));
    }

    public static double convertToCentimeters(int inches){
        return  inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }

}
