package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {

    @DataProvider(name = "ValuesForCosTest")
    public Object[][] valuesForCos() {
        return new Object[][] {
                {0, 0},
                {1.5, Math.sin(1.5)},
                {-1, Math.sin(-1)},
        };
    }

    @Test(dataProvider = "ValuesForCosTest")
    public void cosTest(double a, double expectedValue) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedValue, "Inavlid result of cos");
    }
}
