package LineCoverageTest;

import org.emp.gl.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramLineCoverageTest {
    @Test
    void testNullString1() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }

    @Test
    void testNullString2() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(Anagram.isAnagram("", ""));
    }

    @Test
    void testAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void testNonAnagramDifferentLength() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testNonAnagramSameLength() {
        assertFalse(Anagram.isAnagram("abc", "def"));
    }
}