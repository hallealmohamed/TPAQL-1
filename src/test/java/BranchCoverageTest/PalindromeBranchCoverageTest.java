package BranchCoverageTest;

import org.emp.gl.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeBranchCoverageTest {
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testSingleChar() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void testEvenLengthPalindrome() {
        assertTrue(Palindrome.isPalindrome("abba"));
    }

    @Test
    void testOddLengthPalindrome() {
        assertTrue(Palindrome.isPalindrome("abcba"));
    }

    @Test
    void testNonPalindromeEarlyReturn() {
        assertFalse(Palindrome.isPalindrome("abca"));
    }
}