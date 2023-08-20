import CodingChallenges.DecimalComparator;
import CodingChallenges.TeenNumberChecker;
import org.junit.Assert;
import org.junit.Test;

import static utils.LoggerUtil.logInfo;


public class ChallengesTests {
    double value = 12.12381247;
    double value1 = 12.1240123;

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
        comparedValue = TeenNumberChecker.isTeen()
    }
}
