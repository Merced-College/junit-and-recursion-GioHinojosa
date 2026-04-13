/**
 * Name: Gio Hinojosa
 * Date: 2026-04-13
 * Description:
 * This class contains recursive solutions to practice problems involving
 * digit counting, string searching, and string cleaning. No loops are used.
 */

public class RecursionProblems {

    // Problem 1: count8
    public static int count8(int n) {
        if (n == 0) return 0;

        int last = n % 10;
        int rest = n / 10;

        if (last == 8) {
            if (rest % 10 == 8) {
                return 2 + count8(rest);
            } else {
                return 1 + count8(rest);
            }
        }

        return count8(rest);
    }

    // Problem 2: countHi
    public static int countHi(String str) {
        if (str.length() < 2) return 0;

        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }

        return countHi(str.substring(1));
    }

    // Problem 3: countHi2 (skip if 'x' before hi)
    public static int countHi2(String str) {
        if (str.length() < 2) return 0;

        if (str.startsWith("xhi")) {
            return countHi2(str.substring(1));
        }

        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));
    }

    // Problem 4: strCount (non-overlapping)
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;

        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        return strCount(str.substring(1), sub);
    }

    // Problem 5: stringClean
    public static String stringClean(String str) {
        if (str.length() <= 1) return str;

        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }
}
