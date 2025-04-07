package ConditionCoverageTest;

import org.emp.gl.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeConditionCoverageTest {
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
    void testPalindromeNoMismatch() {
        assertTrue(Palindrome.isPalindrome("abba"));
    }

    @Test
    void testNonPalindromeFirstLastMismatch() {
        assertFalse(Palindrome.isPalindrome("abca"));
    }

    @Test
    void testNonPalindromeMiddleMismatch() {
        assertFalse(Palindrome.isPalindrome("abbc"));
    }
}