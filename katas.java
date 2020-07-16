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

/**
 * You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 */

import java.util.Arrays;

class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return new String("");
        }

        // Remove duplicates
        String[] array = Arrays.stream(strarr).distinct().toArray(String[]::new);

        // Find longest consenc
        int bigestInt = 0;
        int bigestStrStartIndex = 0;
        StringBuffer result = new StringBuffer();

        for (int step = 0; (step + k - 1) < array.length; step++) {
            int sum = 0;
            for (int n = step; n < (k + step); n++) {
                sum = sum + array[n].length();
            }

            if (bigestInt < sum) {
                bigestInt = sum;
                bigestStrStartIndex = step;
            }
        }

        for (int l = bigestStrStartIndex; l < (k + bigestStrStartIndex); l++) result.append(array[l]);

        return String.join("", result);
    }
}


/**
 * max diff - easy 7kyu
 * You must implement a function maxDiff that return the difference between the biggest and the smallest value in a list(lst) received as parameter.
 * If the list is empty or contains a single element, return 0.
 * The list(lst) is not sorted.
 */

import java.util.Arrays;

public class Kata {

  public static int maxDiff(int[] lst) {
    if (lst.length == 0) return 0;
    Arrays.sort(lst);
    return lst[lst.length-1] - lst[0];
  }
}