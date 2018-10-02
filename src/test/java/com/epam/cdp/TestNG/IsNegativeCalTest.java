package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeCalTest extends BaseTest {

    @DataProvider(name = "ValuesForIsNegativeTest")
    public Object[][] valuesForIsNegative() {
        return new Object[][] {
                {1, false},
                {0, false},
                {-1, true},
        };
    }

    @Test(dataProvider = "ValuesForIsNegativeTest")
    public void IsPositiveTest(long a, boolean expectedValue) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(result, expectedValue, "Inavlid result");
    }
}
