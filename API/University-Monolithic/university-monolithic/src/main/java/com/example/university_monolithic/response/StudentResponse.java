package com.example.university_monolithic.response;

import com.example.university_monolithic.entity.Student;
import lombok.Data;

@Data
public class StudentResponse {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;

    public StudentResponse(Student student){
        this.id = student.getId();
        this.firstName = student.getFirst_name();
        this.lastName = student.getLast_name();
        this.email = student.getEmail();
        this.city = student.getAddress().getCity();
        this.street = student.getAddress().getStreet();
    }
}
