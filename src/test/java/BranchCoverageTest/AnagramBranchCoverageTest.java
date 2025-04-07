package BranchCoverageTest;

import org.emp.gl.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramBranchCoverageTest {
    @Test
    void testNullInputBranch() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }

    @Test
    void testDifferentLengthBranch() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testSameLengthNotAnagramBranch() {
        assertFalse(Anagram.isAnagram("abc", "def"));
    }

    @Test
    void testAnagramBranch() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void testAnagramWithSpacesBranch() {
        assertTrue(Anagram.isAnagram("dormitory", "dirty room"));
    }
}