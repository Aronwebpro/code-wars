/**
    Rules are: (1) the letters are adjacent in the English alphabet, and (2) each letter occurs only once.
    For example:
    solve("abc") = True, because it contains a,b,c
    solve("abd") = False, because a, b, d are not consecutive/adjacent in the alphabet, and c is missing.
    solve("dabc") = True, because it contains a, b, c, d
    solve("abbc") = False, because b does not occur once.
    solve("v") = True
 */

import java.util.Arrays;

class ConsecutiveLetters {
    public static boolean solve(String str) {
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      String sortedStr = new String(charArray);
      return "abcdefghijklmnopqrstuvwxyz".indexOf(sortedStr) != -1;
    }
}

/**
 * Implement a function, multiples(m, n), which returns an array of the first m multiples of the real number n. Assume that m is a positive integer.
 *
 * multiples(3, 5.0) => [5.0, 10.0, 15.0]
 */
class MmultiplesOfN {
    public static int[] multiples(int m, int n) {
        int [] nums = new int [m];
        for (int i = 0; i < m; i++) {
            nums[i] = n * (i + 1);
        }
        return nums;
    }
}
