package katas.kyu7;

import java.util.*;

public class ArrayLeaders {
    public List <Integer> solution(int[] numbers) {

        int index = 0;
        int length = numbers.length;
        List <Integer> result = new ArrayList<>();

        for (int n : numbers) {
            if (length - index > 2) {
                int[] list = Arrays.copyOfRange(numbers, index + 1, length);
                int sum = Arrays.stream(list).reduce(0, Integer::sum);
                if (n > sum) {
                    result.add(n);
                }
            } else if (length - index > 1) {
                if (n > numbers[length - 1]) {
                    result.add(n);
                }
            } else {
                if (n != 0) {
                    result.add(n);
                }
            }
            index++;
        }
        System.out.println(result.toString());
        return result;
    }
}

