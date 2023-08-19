import CodingChallenges.DecimalComparator;
import org.junit.Assert;
import org.junit.Test;

import static utils.LoggerUtil.logInfo;


public class ChallengesTests {
    double value = 12.12381247;
    double value1 = 12.1240123;

    @Test()
    public void falseDecimalComparatorTest() {
        boolean comparedValue = DecimalComparator.areEqualByThreeDecimalPlaces(value, value1);
        logInfo(comparedValue);
        logInfo("message");
        Assert.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(value, value1));
    }
    @Test
    public void trueDecimalComparatorTest(){
        Assert.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(value, value1));
    }
}
