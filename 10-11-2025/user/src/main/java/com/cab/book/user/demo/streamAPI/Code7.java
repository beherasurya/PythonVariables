package com.cab.book.user.demo.streamAPI;

import org.springframework.util.comparator.Comparators;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code7 {

    public static void main(String[] args) {
        //Write a program to groups strings by their length using JAVA 8

        List<String> list = Arrays.asList("India","India","Aus","Aus","Eng");
        Map<String, Long> wordCount = list.stream().collect(Collectors
                        .groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordCount);
        //Group by length of words
        Map<Integer, Set<String>> words =
                list.stream().collect(Collectors.groupingBy(String::length,
                        Collectors.toSet()));
        System.out.println(words);

    }
}
