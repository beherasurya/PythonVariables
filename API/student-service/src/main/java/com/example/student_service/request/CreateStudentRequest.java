package com.example.university_monolithic.request;

import lombok.Data;

@Data
public class CreateStudentRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;
}
