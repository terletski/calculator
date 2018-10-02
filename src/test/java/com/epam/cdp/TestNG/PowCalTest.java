package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest {

    @DataProvider(name = "ValuesForPowTest")
    public Object[][] valuesForMultLong() {
        return new Object[][] {
                {1, 0, 1},
                {2, 1, 2},
                {10, 10, 1.0E10},
                {-1, -1, -1.0},
                {-10, 10, 1.0E10},
                {10, -10, 1.0E-10},
        };
    }

    @Test(dataProvider = "ValuesForPowTest")
    public void powTest(double a, double b, double expectedValue) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of pow");
    }
}

