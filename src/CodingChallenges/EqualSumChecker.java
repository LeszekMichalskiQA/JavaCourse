package CodingChallenges;

public class EqualSumChecker {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = a + b;
        hasEqualSum(a, b, c);
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        return a + b == c;
    }
}

