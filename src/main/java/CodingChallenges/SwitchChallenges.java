package CodingChallenges;


import utils.Data;

import static utils.LoggerUtil.*;

public class SwitchChallenges extends Data {

    public static String natoWords(char letter){
        String words = "";
        switch (letter){
            case 'a' -> words = "A is Able";
            case 'b' -> words = "B is Baker";
            case 'c' -> words = "C is Charlie";
            case 'd' -> words = "D is Dog";
            case 'e' -> words = "E is Easy";
            default -> logInfo(String.format("Letter %s was not found in the switch", letter));
        }
        return words;
    }
    public static String printDayOfTheWeek(int day) {
        String dayStringValue = "";
        switch (day) {
            case 0 -> dayStringValue = SUNDAY;
            case 1 -> dayStringValue = MONDAY;
            case 2 -> dayStringValue = TUESDAY;
            case 3 -> dayStringValue = WEDNESDAY;
            case 4 -> dayStringValue = THURSDAY;
            case 5 -> dayStringValue = FRIDAY;
            case 6 -> dayStringValue = SATURDAY;
            default -> logError("%s is NOT a valid day number", day);
        }
        return dayStringValue;
    }

}
