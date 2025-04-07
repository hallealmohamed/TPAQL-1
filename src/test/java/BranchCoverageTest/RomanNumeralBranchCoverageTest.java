package BranchCoverageTest;

import org.emp.gl.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralBranchCoverageTest {
    @Test
    void testInvalidInputBranch() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    void testSimpleSymbolsBranch() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("V", RomanNumeral.toRoman(5));
        assertEquals("X", RomanNumeral.toRoman(10));
    }

    @Test
    void testSubtractiveNotationBranch() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XL", RomanNumeral.toRoman(40));
    }

    @Test
    void testComplexNumbersBranch() {
        assertEquals("MCMXCIX", RomanNumeral.toRoman(1999));
        assertEquals("MMXXIII", RomanNumeral.toRoman(2023));
    }
}