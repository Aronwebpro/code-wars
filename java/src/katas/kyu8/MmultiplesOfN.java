package katas.kyu8;

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
