package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalTest extends BaseTest {

    @DataProvider(name = "ValuesForSinTest")
    public Object[][] valuesForSin() {
        return new Object[][] {
                {0, 0},
                {1.5, Math.sin(1.5)},
                {-1, Math.sin(-1)},
        };
    }

    @Test(dataProvider = "ValuesForSinTest")
    public void sinTest(double a, double expectedValue) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedValue, "Inavlid result of sin");
    }
}
