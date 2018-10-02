package com.epam.cdp.Junit;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumCalTest {

    @Test
    @DisplayName("4 + 2 = 6")
    void sumLongTest() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.sum(4, 2), "4 + 2 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void valuesForSumlong(long first, long second, long expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.sum(first, second),
                ()->  first + " + " + second + " should equal " + expectedResult);
    }
}