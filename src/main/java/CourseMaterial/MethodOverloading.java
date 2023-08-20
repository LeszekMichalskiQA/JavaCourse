package CourseMaterial;

import utils.Generator;

import static utils.LoggerUtil.logInfo;

public class MethodOverloading {
    public static void main(String[] args) {
        int inches = Generator.getRandomInt(1, 60);
        int heightInFeet = 6;
        int remainingHeightInInches = 12;
        logInfo(String.format(inches + " inches equals " + convertToCentimeters(inches) + " cm"));
//        convertToCentimeters();
    }

    public static double convertToCentimeters(int a){
        double convertedValue = a * 2.54;
        logInfo(String.valueOf(convertedValue));
        return convertedValue;
    }
    public static int convertToCentimeters(int a, int b){

        return a;
    }
}
