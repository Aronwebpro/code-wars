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
      String sortedStr = new Solution().sortString(str);
      return "abcdefghijklmnopqrstuvwxyz".indexOf(sortedStr) != -1; 
    }
}