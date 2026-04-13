import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Name: Gio Hinojosa
 * Date: 2026-04-13
 * Description:
 * JUnit tests for recursive methods in RecursionProblems class.
 */
public class RecursionProblemsTest {
    // count8 tests
    @Test
    public void testCount8_1() {
        assertEquals(1, RecursionProblems.count8(8));
    }
    @Test
    public void testCount8_2() {
        assertEquals(2, RecursionProblems.count8(818));
    }
    @Test
    public void testCount8_3() {
        assertEquals(4, RecursionProblems.count8(8818));
    }
    @Test
    public void testCount8_4() {
        assertEquals(0, RecursionProblems.count8(123));
    }
    @Test
    public void testCount8_5() {
        assertEquals(3, RecursionProblems.count8(888));
    }
    @Test
    public void testCount8_6() {
        assertEquals(2, RecursionProblems.count8(1808));
    }
    @Test
    public void testCount8_7() {
        assertEquals(1, RecursionProblems.count8(280));
    }
    @Test
    public void testCount8_8() {
        assertEquals(5, RecursionProblems.count8(8888));
    }
    @Test
    public void testCount8_9() {
        assertEquals(0, RecursionProblems.count8(0));
    }
    @Test
    public void testCount8_10() {
        assertEquals(1, RecursionProblems.count8(108));
    }
    // countHi tests
    @Test
    public void testCountHi_1() {
        assertEquals(1, RecursionProblems.countHi("xxhixx"));
    }
    @Test
    public void testCountHi_2() {
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
    }
    @Test
    public void testCountHi_3() {
        assertEquals(1, RecursionProblems.countHi("hi"));
    }
    @Test
    public void testCountHi_4() {
        assertEquals(0, RecursionProblems.countHi("hello"));
    }
    @Test
    public void testCountHi_5() {
        assertEquals(3, RecursionProblems.countHi("hihi hi".replace(" ", "")));
    }
    @Test
    public void testCountHi_6() {
        assertEquals(0, RecursionProblems.countHi(""));
    }
    @Test
    public void testCountHi_7() {
        assertEquals(1, RecursionProblems.countHi("ahib"));
    }
    @Test
    public void testCountHi_8() {
        assertEquals(2, RecursionProblems.countHi("hihihi"));
    }
    @Test
    public void testCountHi_9() {
        assertEquals(1, RecursionProblems.countHi("xxhi"));
    }
    @Test
    public void testCountHi_10() {
        assertEquals(0, RecursionProblems.countHi("xhx"));
    }
    // countHi2 tests
    @Test
    public void testCountHi2_1() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
    }
    @Test
    public void testCountHi2_2() {
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
    }
    @Test
    public void testCountHi2_3() {
        assertEquals(0, RecursionProblems.countHi2("xhixhi"));
    }
    @Test
    public void testCountHi2_4() {
        assertEquals(1, RecursionProblems.countHi2("hi"));
    }
    @Test
    public void testCountHi2_5() {
        assertEquals(0, RecursionProblems.countHi2("xhi"));
    }
    @Test
    public void testCountHi2_6() {
        assertEquals(2, RecursionProblems.countHi2("hihihi"));
    }
    @Test
    public void testCountHi2_7() {
        assertEquals(1, RecursionProblems.countHi2("ahihi"));
    }
    @Test
    public void testCountHi2_8() {
        assertEquals(0, RecursionProblems.countHi2(""));
    }
    @Test
    public void testCountHi2_9() {
        assertEquals(1, RecursionProblems.countHi2("bhi"));
    }
    @Test
    public void testCountHi2_10() {
        assertEquals(1, RecursionProblems.countHi2("xxhix"));
    }
    // strCount tests
    @Test
    public void testStrCount_1() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
    }
    @Test
    public void testStrCount_2() {
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow"));
    }
    @Test
    public void testStrCount_3() {
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
    }
    @Test
    public void testStrCount_4() {
        assertEquals(3, RecursionProblems.strCount("aaaa", "aa"));
    }
    @Test
    public void testStrCount_5() {
        assertEquals(1, RecursionProblems.strCount("hello", "he"));
    }
    @Test
    public void testStrCount_6() {
        assertEquals(0, RecursionProblems.strCount("hello", "bye"));
    }
    @Test
    public void testStrCount_7() {
        assertEquals(2, RecursionProblems.strCount("ababab", "ab"));
    }
    @Test
    public void testStrCount_8() {
        assertEquals(1, RecursionProblems.strCount("xyz", "xyz"));
    }
    @Test
    public void testStrCount_9() {
        assertEquals(0, RecursionProblems.strCount("", "a"));
    }
    @Test
    public void testStrCount_10() {
        assertEquals(2, RecursionProblems.strCount("mississippi", "iss"));
    }
    // stringClean test
    @Test
    public void testStringClean_1() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
    }
    @Test
    public void testStringClean_2() {
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
    }
    @Test
    public void testStringClean_3() {
        assertEquals("Helo", RecursionProblems.stringClean("Hello"));
    }
    @Test
    public void testStringClean_4() {
        assertEquals("abc", RecursionProblems.stringClean("aaabbbccc"));
    }
    @Test
    public void testStringClean_5() {
        assertEquals("a", RecursionProblems.stringClean("aaaa"));
    }
    @Test
    public void testStringClean_6() {
        assertEquals("", RecursionProblems.stringClean(""));
    }
    @Test
    public void testStringClean_7() {
        assertEquals("ab", RecursionProblems.stringClean("aab"));
    }
    @Test
    public void testStringClean_8() {
        assertEquals("abcde", RecursionProblems.stringClean("abcde"));
    }
    @Test
    public void testStringClean_9() {
        assertEquals("aB", RecursionProblems.stringClean("aaBB"));
    }
    @Test
    public void testStringClean_10() {
        assertEquals("xyz", RecursionProblems.stringClean("xxxyyyzzz"));
    }
}
