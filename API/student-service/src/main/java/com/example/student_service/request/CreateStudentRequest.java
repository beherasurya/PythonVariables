package com.example.student_service.request;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CreateStudentRequest {

    private String firstName;
    private String lastName;
    private String email;
    private int addressId;
}
