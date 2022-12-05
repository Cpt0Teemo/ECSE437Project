package com.ecse437project.tests;

import com.ecse437project.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    void shouldMultiplyTwoPositiveNumbers() {
        int x = 5;
        int y = 3;

        int result = Multiplication.apply(x, y);

        int expected = x * y;
        assertEquals(expected, result);
    }

    @Test
    void shouldMultiplyTwoNegativeNumbers() {
        int x = -5;
        int y = -3;

        int result = Multiplication.apply(x, y);

        int expected = x * y;
        assertEquals(expected, result);
    }

    @Test
    void shouldMultiplyOneNegativeNumber() {
        int x = -5;
        int y = 3;

        int result = Multiplication.apply(x, y);

        int expected = x * y;
        assertEquals(expected, result);
    }

    @Test
    void shouldMultiplyWithZero() {
        int x = 5;

        int result = Multiplication.apply(x, 0);

        assertEquals(0, result);
    }
}
