package katas.kyu7;
import java.util.Arrays;

/**
 * You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 */
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