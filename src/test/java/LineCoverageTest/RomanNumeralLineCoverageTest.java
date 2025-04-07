package LineCoverageTest;

import org.emp.gl.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralLineCoverageTest {
    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testNumberTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    void testOne() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void testFour() {
        assertEquals("IV", RomanNumeral.toRoman(4));
    }

    @Test
    void testFive() {
        assertEquals("V", RomanNumeral.toRoman(5));
    }

    @Test
    void testNine() {
        assertEquals("IX", RomanNumeral.toRoman(9));
    }

    @Test
    void testTen() {
        assertEquals("X", RomanNumeral.toRoman(10));
    }

    @Test
    void testForty() {
        assertEquals("XL", RomanNumeral.toRoman(40));
    }

    @Test
    void testFifty() {
        assertEquals("L", RomanNumeral.toRoman(50));
    }

    @Test
    void testNinety() {
        assertEquals("XC", RomanNumeral.toRoman(90));
    }

    @Test
    void testOneHundred() {
        assertEquals("C", RomanNumeral.toRoman(100));
    }

    @Test
    void testFourHundred() {
        assertEquals("CD", RomanNumeral.toRoman(400));
    }

    @Test
    void testFiveHundred() {
        assertEquals("D", RomanNumeral.toRoman(500));
    }

    @Test
    void testNineHundred() {
        assertEquals("CM", RomanNumeral.toRoman(900));
    }

    @Test
    void testOneThousand() {
        assertEquals("M", RomanNumeral.toRoman(1000));
    }

    @Test
    void testComplexNumber() {
        assertEquals("MCMXCIX", RomanNumeral.toRoman(1999));
    }
}