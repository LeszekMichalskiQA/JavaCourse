package CourseMaterial;

import utils.Generator;

import java.util.ArrayList;
import java.util.List;

import static utils.LoggerUtil.logInfo;

public class ForLoop {
    static int primeCounter = 0;

    public static void main(String[] args) {
        isPrime(Generator.getRandomIntList(2, 100, 10, 50));
    }

    public static void isPrime(List<Integer> wholeNumbers) {
        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> nonPrimeNumbers = new ArrayList<>();

        for (int num : wholeNumbers) {
            if (primeCounter >= 3) {
                break;
            }
            if (isPrime(num)) {
                primeNumbers.add(num);
                primeCounter++;
                if (primeCounter <= 0) {
                    logInfo("Found prime number #" + primeCounter + ": " + num);
                }
            } else {
                nonPrimeNumbers.add(num);
            }

        }
        logInfo("Prime numbers are - " + primeNumbers);
        logInfo("Non Prime numbers are - " + nonPrimeNumbers);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void calculateValue(double amount) {
        for (double rate = 7.0; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(amount, rate);
            System.out.printf("10,000 at %.1f%% interest = %.2f%n", rate, interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }

    public static List<Integer> isPrimeCounter(int startNumber) {
        List<Integer> primeList = new ArrayList<>();
        int number = startNumber;
        while (primeList.size() < 3) {
            if (isPrime(number)) {
                primeList.add(number);
            }
            number++;
        }
        return primeList;
    }
}
