package CodingChallenges;

import utils.Generator;

import java.util.List;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        List<Integer> integerNumbers = Generator.getRandomIntList(-100, 100, 7, 35);
        List<Double> doubleNumbers = Generator.getRandomDoubleList(-100, 100, 30, 100);

        checkNumber(integerNumbers);
        checkNumber(doubleNumbers);
    }

    private static <T extends Number> void checkNumber(List<T> numbers) {
        for (Number number : numbers) {
            String result;
            if (number instanceof Integer) {
                result = getNumberStatus(number.intValue());
                System.out.printf("Number %d is %s%n", number.intValue(), result);
            } else if (number instanceof Double) {
                result = getNumberStatus(number.doubleValue());
                System.out.printf("Number %.2f is %s%n", number.doubleValue(), result);
            }
        }
    }
    private static String getNumberStatus(int number) {
        return getNumberStatusHelper(number);
    }
    private static  String getNumberStatus(double number){
        return getNumberStatusHelper(number);
    }

    private static String getNumberStatusHelper(double number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "equal to zero";
        }
    }

}
