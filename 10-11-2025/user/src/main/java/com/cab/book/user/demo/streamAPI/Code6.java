package com.cab.book.user.demo.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Code6 {

    public static void main(String[] args) {
        //Find the Max value from a array of Integers
        Integer arr1[] = {8,9,12,44,22,33};
        int maxValue = Arrays.stream(arr1).max(Integer::compareTo)
                .get();

        System.out.println(maxValue);
        //Find the second Highest from above Array
        int secondMaxValue = Arrays.stream(arr1).sorted(Comparator.comparing(Integer::intValue)
                        .reversed()).skip(1).findFirst().get();
        System.out.println(secondMaxValue);

        int secondHighest = Arrays.stream(arr1)
                .filter(num -> num!=maxValue)
                .max(Integer::compareTo)
                .get();
        System.out.println(secondHighest);

    }
}
