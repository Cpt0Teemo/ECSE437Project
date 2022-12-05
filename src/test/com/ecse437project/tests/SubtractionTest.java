package com.ecse437project.tests;

import com.ecse437project.Substraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        int x = 5;
        int y = 3;

        int result = Substraction.apply(x, y);

        int expected = x - y;
        assertEquals(expected, result);
    }

    @Test
    void shouldSubtractTwoNegativeNumbers() {
        int x = -5;
        int y = -3;

        int result = Substraction.apply(x, y);

        int expected = x - y;
        assertEquals(expected, result);
    }

    @Test
    void shouldSubtractWithZero() {
        int x = 5;

        int result = Substraction.apply(0, x);

        int expected = -5;
        assertEquals(expected, result);
    }
}
