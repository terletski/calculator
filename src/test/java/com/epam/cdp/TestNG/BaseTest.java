package com.epam.cdp.TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass (alwaysRun = true)
    public void tearDown(){
        calculator = null;
    }
}
