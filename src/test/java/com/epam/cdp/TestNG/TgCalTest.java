package com.epam.cdp.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest {
    @DataProvider(name = "ValuesForTgTest")
    public Object[][] valuesForTg() {
        return new Object[][] {
                {0, 0},
                {1.5, Math.tan(1.5)},
                {-1, 0},
        };
    }

    @Test(dataProvider = "ValuesForTgTest")
    public void tgTest(double a, double expectedValue) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue, "Inavlid result of tg");
    }
}
