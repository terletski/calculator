package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class SumCalTest extends BaseTest {

    @DataProvider(name = "ValuesForSumLongTest")
    public Object[][] valuesForSumLong() {
        return new Object[][] {
                {1, 11, 12},
                {-1, 11, 10},
                {-1, -1, -2},
                {0, 0, 0},
                {Long.MAX_VALUE, -1, Long.MAX_VALUE-1},
                {Long.MAX_VALUE, Long.MIN_VALUE, -1},
        };
    }

    @DataProvider(name = "ValuesForSumDoubleTest")
    public Object[][] valuesForSumDouble() {
        return new Object[][] {
                {1.1, 11.1, 12.2},
                {-1.0, 11.1, 10.1},
                {-0.1, -0.1, -0.2},
                {1.0E-6, 1.0E-6, 2.0E-6},
                {Double.POSITIVE_INFINITY, 1, Double.POSITIVE_INFINITY+1},
                {0, Double.POSITIVE_INFINITY, 0+Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Infinity},
                {Double.NEGATIVE_INFINITY, 1,-Infinity},
                {0, Double.NEGATIVE_INFINITY, -Infinity},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, -Infinity},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, -Infinity},
        };
    }

    @Test(dataProvider = "ValuesForSumDoubleTest")
    public void sumDoubleTest(double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of sum");
    }

    @Test(dataProvider = "ValuesForSumLongTest")
    public void sumLongTest(long a, long b, long expectedValue) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of sum");
    }
}
