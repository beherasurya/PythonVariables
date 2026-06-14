package com.cab.book.user.demo.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code5 {

    public static void main(String[] args) {
        //Convert strings to uppercase in a List
        List<String> list = Arrays.asList("tiger","lion","cow","jackel");
        list.stream().map(word -> word.toUpperCase())
                .collect(Collectors.toList());
        List<String> upperCaseNames = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(upperCaseNames);
    }
}
