package com.ecse437project.tests;

import com.ecse437project.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest {

    @Test
    void shouldDivideTwoPositiveNumbers() {
        int x = 5;
        int y = 3;

        int result = Division.apply(x, y);

        int expected = x / y;
        assertEquals(expected, result);
    }

    @Test
    void shouldDivideTwoNegativeNumbers() {
        int x = -5;
        int y = -3;

        int result = Division.apply(x, y);

        int expected = x / y;
        assertEquals(expected, result);
    }

    @Test
    void shouldDivideOneNegativeNumber() {
        int x = -5;
        int y = 3;

        int result = Division.apply(x, y);

        int expected = x / y;
        assertEquals(expected, result);
    }

    @Test
    void shouldBreakWhenDividingByZero() {
        int x = 5;

        assertThrows(IllegalStateException.class ,() -> Division.apply(x, 0));
    }

    @Test
    void shouldDivideZero() {
        int x = 5;

        int result = Division.apply(0, x);

        assertEquals(0, result);
    }
}
