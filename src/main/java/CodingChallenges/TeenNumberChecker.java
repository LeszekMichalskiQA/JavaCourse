package CodingChallenges;

import utils.Generator;

import java.util.ArrayList;
import java.util.List;

import static utils.LoggerUtil.logInfo;

public class TeenNumberChecker {
    public static void main(String[] args) {
        List<Integer> numbers = Generator.getRandomIntList(0, 30, 3, 3);
        System.out.println(hasTeen(numbers));
    }

    public static List<Integer> hasTeen(List<Integer> numbers) {
        List<Integer> finalNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (isTeen(number)) {
                finalNumbers.add(number);
            }
        }
        if (finalNumbers.size() == 0) {
            logInfo("Final numbers list is empty");
        }
        return finalNumbers;
    }

    private static boolean isTeen(int number) {
        return (number >= 13 && number <= 19);
    }

}
