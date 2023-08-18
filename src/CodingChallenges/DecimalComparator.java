package CodingChallenges;


public class DecimalComparator {
    public static void main(String[] args){
        double firstNumber = 10.123412312312;
        double secondNumber = 10.1244124124123;
        boolean decimal = areEqualByThreeDecimalPlaces(firstNumber, secondNumber);
        System.out.println(decimal);
    }

    //Compare to the third decimal  point.

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        boolean areEqual;
        long convertedFirstNumber = (long) (firstNumber * 1000);
        long convertedSecondNumber = (long) (secondNumber * 1000);
        areEqual = convertedFirstNumber == convertedSecondNumber;
        return areEqual;
    }
}
