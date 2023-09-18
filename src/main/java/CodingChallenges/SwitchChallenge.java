package CodingChallenges;

import java.util.Arrays;
import java.util.List;

import static utils.LoggerUtil.*;

public class SwitchChallenge {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');
        for(char letter : chars){
            switchChallenger(letter);
        }
    }


    public static void switchChallenger(char letter){
        switch (letter){
            case 'a' -> logInfo("Able");
            case 'b' -> logInfo("Baker");
            case 'c' -> logInfo("Charlie");
            case 'd' -> logInfo("Dog");
            case 'e' -> logInfo("Easy");
        }

    }
}
