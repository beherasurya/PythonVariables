package com.example.student_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int studentId;
    private String first_name;
    private String last_name;
    private String email;
    @Column(name = "address_id")
    private int  addressId;
}
