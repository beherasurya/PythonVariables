package com.cab.book.user.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private int id;
    private String dept;

    private String name;

    private double salary;

}
