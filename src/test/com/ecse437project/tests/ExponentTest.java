package com.ecse437project.tests;

import com.ecse437project.Exponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentTest {

    @Test
    void shouldExponentTwoPositiveNumbers() {
        int x = 5;
        int y = 3;

        int result = Exponent.apply(x, y);

        int expected = 125;
        assertEquals(expected, result);
    }

    @Test
    void shouldExponentTwoNegativeNumbers() {
        int x = -5;
        int y = -3;

        int result = Exponent.apply(x, y);

        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void shouldExponentOneOddNegativeNumber() {
        int x = -5;
        int y = 3;

        int result = Exponent.apply(x, y);

        int expected = -125;
        assertEquals(expected, result);
    }

    @Test
    void shouldExponentOneEvenNegativeNumber() {
        int x = -5;
        int y = 2;

        int result = Exponent.apply(x, y);

        int expected = 25;
        assertEquals(expected, result);
    }

    @Test
    void shouldExponentWithZero() {
        int x = 5;

        int result = Exponent.apply(x, 0);

        assertEquals(1, result);
    }
}
