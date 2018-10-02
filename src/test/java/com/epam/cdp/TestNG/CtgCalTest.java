package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest {

    @DataProvider(name = "ValuesForCtgTest")
    public Object[][] valuesForCtg() {
        return new Object[][] {
                {0, 0},
                {1.5, Math.tanh(1.5)},
                {-1, Math.tanh(-1)},
        };
    }

    @Test(dataProvider = "ValuesForCtgTest")
    public void ctgTest(double a, double expectedValue) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedValue, "Inavlid result of ctg");
    }
}
