package utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static utils.LoggerUtil.logInfo;

public class Generator {
    private static final Random random = new Random();

    private static Random getRandomInstance() {
        return random;
    }

    public static int getRandomInt(int min, int max) {
        int generatedInt = getRandomInstance().nextInt((max - min) + 1) + min;
        logInfo(String.format("Your int number is - %d", generatedInt));
        return  generatedInt;
    }

    public static List<Integer> getRandomIntList(int min, int max, int minAmountOfNumbers, int maxAmountOfNumbers) {
        int count = getRandomInstance().nextInt(maxAmountOfNumbers - minAmountOfNumbers + 1) + minAmountOfNumbers;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(getRandomInt(min, max));
        }
        logInfo(numbers.size() + " - Integer numbers were generated");
        logInfo(String.format("Numbers are %s", numbers));
        return numbers;
    }

    public static double getRandomDouble(double min, double max) {
        return min + (max - min) * getRandomInstance().nextDouble();
    }

    public static List<Double> getRandomDoubleList(double min, double max, int minAmountOfNumbers, int maxAmountOfNumbers) {
        int count = generateCount(minAmountOfNumbers, maxAmountOfNumbers);
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(getRandomDouble(min, max));
        }
        logInfo(numbers.size() + " - Double numbers were generated");
        return numbers;
    }
    private static Integer generateCount(int minAmountOfNumbers, int maxAmountOfNumbers){
        return getRandomInstance().nextInt(maxAmountOfNumbers - minAmountOfNumbers + 1) + minAmountOfNumbers;
    }
}
