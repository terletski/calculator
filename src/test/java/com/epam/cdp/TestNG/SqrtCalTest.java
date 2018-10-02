package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest {

    @DataProvider(name = "ValuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][] {
                {1, 1},
                {2.25, 1.5},
                {0, 0},
                {-25, 5},
        };
    }

    @Test(dataProvider = "ValuesForSqrtTest")
    public void sqrtTest(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Inavlid result of sqrt");
    }
}
