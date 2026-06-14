package com.cab.book.user.demo.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code4 {

    public static void main(String[] args) {
        //Fiter out even numbers from a List
        List<Integer> list = Arrays.asList(9,4,2,1,5,6,8,10);
        List<Integer> evenNumList = list.stream().filter(num -> num%2 ==0)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(evenNumList);
    }
}
