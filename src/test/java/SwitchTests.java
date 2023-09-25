import CodingChallenges.SwitchChallenges;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import utils.Generator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SwitchTests extends SwitchChallenges {

    @Test
    public void dayOfTheWeekTest() {
        SoftAssert softAssert = new SoftAssert();

        Map<Integer, String> dayMap = Map.of(
                0, SUNDAY,
                1, MONDAY,
                2, TUESDAY,
                3, WEDNESDAY,
                4, THURSDAY,
                5, FRIDAY,
                6, SATURDAY
        );

        List<Integer> days = Generator.getRandomIntList(0, 9, 6, 6);
        for (int dayInt : days) {
            String expectedDay = dayMap.get(dayInt);
            if (expectedDay == null) {
                expectedDay = String.format("%s is NOT a valid day number", dayInt);
            }
            softAssert.assertEquals(printDayOfTheWeek(dayInt), expectedDay, String.format("%s is NOT equal to saved day", dayInt));
        }
        softAssert.assertAll();
    }

    @Test
    public void natoWordsTest() {
        SoftAssert softAssert = new SoftAssert();
        Map<Character, String> letterMap = Map.of(
                'a', "A is Able",
                'b', "B is Baker",
                'c', "C is Charlie",
                'd', "D is Dog",
                'e', "E is Easy",
                'f', "Letter f was not found in the switch"
        );

        List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f');
        for (char letter : chars) {
            String expectedLetter = letterMap.get(letter);
            if (expectedLetter == null) {
                expectedLetter = String.format("%s is NOT a valid letter", letter);
            }
            softAssert.assertEquals(natoWords(letter), expectedLetter, String.format("%s is NOT a valid letter", letter));
        }
        softAssert.assertAll();
    }
}
