package CodingChallenges;

import utils.Generator;

public class MegaBytesConverter {
    public static void main(String[] args) {
        int kilobytes = Generator.getRandomInt(-10, 10000);
        printMegaBytesAndKiloBytes(kilobytes);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, megaBytes, remainingKiloBytes);
        }
    }
}
