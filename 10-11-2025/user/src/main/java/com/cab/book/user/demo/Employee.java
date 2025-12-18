package com.cab.book.user.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private int id;

    private String name;

    private int age;

    private long salary;

    private String gender;

    private String deptName;

    private String city;

    private int yearOfJoining;

}
