package com.cab.book.user.demo.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Code3 {

    public static void main(String args[]){

        String a = "bababddddeeeff";
        Arrays.stream(a.split("")).sorted().distinct().forEach(System.out::print);
        System.out.println();
        List<String> list = Arrays.stream(a.split("")).sorted().distinct()
                .collect(Collectors
                .toList());
        System.out.println(list);

        //Find the Word having Second Highest Length from a String
        String b = "India won the  Cup 2025";
        String secMax = Arrays.stream(b.split(" ")).skip(1)
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(secMax);
        String result = Arrays.stream(b.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();
        System.out.println(result);

    }
}
