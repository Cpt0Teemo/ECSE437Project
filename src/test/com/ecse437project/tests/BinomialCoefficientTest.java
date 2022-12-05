package com.ecse437project.tests;

import com.ecse437project.BinomialCoefficient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinomialCoefficientTest {

    @Test
    void shouldBinomialTwoPositiveNumbers() {
        int x = 5;
        int y = 3;

        int result = BinomialCoefficient.apply(x, y);

        int expected = 10;
        assertEquals(expected, result);
    }

    @Test
    void shouldBreakWhenAnyNegativeNumber() {
        int x = 5;
        int y = 3;

        assertThrows(IllegalStateException.class ,() -> BinomialCoefficient.apply(-x, y));
        assertThrows(IllegalStateException.class ,() -> BinomialCoefficient.apply(x, -y));
        assertThrows(IllegalStateException.class ,() -> BinomialCoefficient.apply(-x, -y));
    }
}
