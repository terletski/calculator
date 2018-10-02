package com.epam.cdp.Junit;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivCalTest {

    @Test
    @DisplayName("4 / 2 = 2")
    void sumLongTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sum(4, 2), "4 / 2 should equal 2");
    }

    @ParameterizedTest(name = "{0} / {1} = {0}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   0",
            "40,  20, 2",
            "100,  50, 2"
    })
    void valuesForSumlong(long first, long second, long expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}