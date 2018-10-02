package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalTest extends BaseTest {

    @DataProvider(name = "ValuesForIsPositiveTest")
    public Object[][] valuesForIsPositive() {
        return new Object[][] {
                {1, true},
                {0, false},
                {-1, false},
        };
    }

    @Test(dataProvider = "ValuesForIsPositiveTest")
    public void sqrtTest(long a, boolean expectedValue) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expectedValue, "Inavlid result");
    }
}
