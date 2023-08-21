import CodingChallenges.DecimalComparator;
import CodingChallenges.TeenNumberChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static utils.LoggerUtil.logInfo;


public class ChallengesTests {
    double value = 12.12381247;
    double value1 = 12.1240123;

    List<Integer> comparedListOfIntegers;
    boolean comparedValue;

    @Test()
    public void falseDecimalComparatorTest() {
        comparedValue = DecimalComparator.areEqualByThreeDecimalPlaces(value, value1);
        logInfo(comparedValue);
        Assert.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(value, value1));
    }
    @Test
    public void trueDecimalComparatorTest(){
        comparedValue = DecimalComparator.areEqualByThreeDecimalPlaces(value, value1);
        logInfo(comparedValue);
        Assert.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(value, value1));
    }
    @Test
    public void teenNumberChecker(){
        List<Integer> integerList = Arrays.asList(13, 14, 15, 16, 17, 18, 19);
        comparedListOfIntegers = TeenNumberChecker.hasTeen(integerList);
        Assert.assertTrue(comparedListOfIntegers.stream().toList().contains(20));
    }
}
