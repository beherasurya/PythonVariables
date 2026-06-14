package com.cab.book.user.demo.codingquestions;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> dupNums = numbers.stream()
                .filter(num -> numbers.indexOf(num) != numbers.lastIndexOf(num)
                ).collect(Collectors.toSet());

        System.out.println(dupNums);
    }

}
