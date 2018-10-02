package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalTest extends BaseTest {

    @DataProvider(name = "ValuesForDivLongTest")
    public Object[][] valuesForDivLong() {
        return new Object[][]{
                {1, 0, 0},
                {0, 1, 0},
                {1, -1, -1},
                {-1, 1, -1},
                {0, 0, 0},
        };
    }

    @DataProvider(name = "ValuesForDivDoubleTest")
    public Object[][] valuesForDivDouble() {
        return new Object[][]{
                {0.1, 0.1, 1},
                {0.1, -0.1, -0.1},
                {-0.1, 0.1, -0.1},
        };
    }

    @DataProvider(name = "ExceptionExpectedData")
    public Object[][] createExceptionData() {
        return new Object[][]{
                {1, 0},
        };
    }

    @Test(dataProvider = "ValuesForDivLongTest")
    public void divLongTest(long a, long b, long expectedValue) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of mult");
    }

    @Test(dataProvider = "ValuesForDivDoubleTest")
    public void divDoubleTest(double a, double b, double expectedValue) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Inavlid result of mult");
    }

    @Test(dataProvider = "ExceptionExpectedData", expectedExceptions = Exception.class)
    public void ExceptionTest(long a, long b) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, createExceptionData());
    }
}