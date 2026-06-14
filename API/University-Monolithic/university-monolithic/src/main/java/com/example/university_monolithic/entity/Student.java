package com.example.university_monolithic.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
