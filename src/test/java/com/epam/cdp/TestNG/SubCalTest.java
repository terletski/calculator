package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static java.lang.Double.NaN;

public class SubCalTest extends BaseTest {

    @DataProvider(name = "ValuesForSubDoubleTest")
    public Object[][] valuesForSubDouble() {
        return new Object[][] {
                {1.1, 11.1, -10.0},
                {-1.0, 11.1, -12.1},
                {-0.1, -0.1, 0},
                {-1.0E-6, 1.0E-6, -2.0E-6},
                {Double.POSITIVE_INFINITY, 1, Double.POSITIVE_INFINITY-1},
                {0, Double.POSITIVE_INFINITY, 0-Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, NaN},
                {Double.NEGATIVE_INFINITY, 1, Double.NEGATIVE_INFINITY-2},
                {0, Double.NEGATIVE_INFINITY, 1-Double.NEGATIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, NaN},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, NaN},
        };
    }

    @DataProvider(name = "ValuesForSubLongTest")
    public Object[][] valuesForSubLong() {
        return new Object[][] {
                {1, 11, -10},
                {11, -11, 22},
                {-1, 1, -2},
                {0, 0, 0},
                {Long.MAX_VALUE, -1, Long.MAX_VALUE+1},
                {Long.MAX_VALUE, Long.MIN_VALUE, -1},

        };
    }

    @Test(dataProvider = "ValuesForSubLongTest")
    public void subLongTest(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of sub");
    }

    @Test(dataProvider = "ValuesForSubDoubleTest")
    public void subDoubleTest(double a, double b, double expectedValue) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of sum");
    }
}
