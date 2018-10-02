package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalTest extends BaseTest {

    @DataProvider(name = "ValuesForMultLongTest")
    public Object[][] valuesForMultLong() {
        return new Object[][] {
                {1, 11, 11},
                {0, 1, 0},
                {1, 0, 0},
                {0, 0, 0},
                {-10, 10, -100},
                {10, -10, -100},
        };
    }

    @DataProvider(name = "ValuesForMultDoubleTest")
    public Object[][] valuesForMultDouble() {
        return new Object[][] {
                {0.1, 0, 0},
                {0, 0.1, 0},
                {0.1, 0.1, 0.01},
                {0, 0, 0},
                {-0.1, 0.1, -0.01},
                {0.1, -0.1, -0.01},
        };
    }

    @Test(dataProvider = "ValuesForMultLongTest")
    public void multLongTest(long a, long b, long expectedValue) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of mult");
    }

    @Test(dataProvider = "ValuesForMultDoubleTest")
    public void multDoubleTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of mult");
    }
}
