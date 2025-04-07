package ConditionCoverageTest;

import org.emp.gl.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramConditionCoverageTest {
    @Test
    void testNullFirstStringCondition() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }

    @Test
    void testNullSecondStringCondition() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null));
    }

    @Test
    void testDifferentLengthCondition() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testSameLengthDifferentLettersCondition() {
        assertFalse(Anagram.isAnagram("abc", "def"));
    }

    @Test
    void testAnagramCondition() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void testAnagramDifferentCaseCondition() {
        assertTrue(Anagram.isAnagram("Listen", "Silent"));
    }
}