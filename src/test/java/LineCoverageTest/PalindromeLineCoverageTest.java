package LineCoverageTest;

import org.emp.gl.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLineCoverageTest {
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
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
    }
}