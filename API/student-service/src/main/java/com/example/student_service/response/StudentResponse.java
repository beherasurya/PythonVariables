package com.example.student_service.response;

import com.example.student_service.entity.Student;
import lombok.Data;

@Data
public class StudentResponse {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AddressResponse addressResponse;

    public StudentResponse(Student student){
        this.id = student.getStudentId();
        this.firstName = student.getFirst_name();
        this.lastName = student.getLast_name();
        this.email = student.getEmail();
    }
}
