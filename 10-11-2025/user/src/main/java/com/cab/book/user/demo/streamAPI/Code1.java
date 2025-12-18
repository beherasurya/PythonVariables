package com.cab.book.user.demo.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code1 {

    public static void main(String[] args) {
        List<Student> studlist = List.of(
                new Student(1, "Rohit", "Kumar", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish", "Malag", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98)
        );

//        Find Students Whose First Name Starts with 'A':

        //Enhanced Switch Block
        int var =1;
        String output = switch (var){

            case 1 -> "It contains 1";
            default -> "It Contains Empty Value";
        };
//        System.out.println(output);

        List<Student> studentNameA = studlist.stream().filter(s -> s.getFirstName()
                .startsWith("A")).collect(Collectors.toList());
        System.out.println("List of students whose name starts with letter A : "
                + studentNameA);

//        System.out.println(studlist);
    }

}
