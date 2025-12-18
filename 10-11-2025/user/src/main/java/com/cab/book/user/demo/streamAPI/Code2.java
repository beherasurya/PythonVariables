package com.cab.book.user.demo.streamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class Code2 {

    public static void main(String args[]){

        String s1 = "India is Best";
        String output = Arrays.stream(s1.split(" "))
                    .max(Comparator.comparing(String::length))
                    .get();
        System.out.println(output);

        int arr1[] = {10,4,7,9,2};
        int value = Arrays.stream(arr1).max()
                .getAsInt();
        int value2 = Arrays.stream(arr1).skip(1)
                .max().getAsInt();
        System.out.println(value+value2);

    }
}
