package com.example.university_monolithic.service;

import com.example.university_monolithic.entity.Address;
import com.example.university_monolithic.entity.Student;
import com.example.university_monolithic.repository.AddressRepository;
import com.example.university_monolithic.repository.StudentRepository;
import com.example.university_monolithic.request.CreateStudentRequest;
import com.example.university_monolithic.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private StudentRepository studentRepository;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {
        Address address = new Address();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());
        address = addressRepository.save(address);

        Student student = new Student();
        student.setFirst_name(createStudentRequest.getFirstName());
        student.setLast_name(createStudentRequest.getLastName());
        student.setEmail(createStudentRequest.getEmail());
        student.setAddress(address);
        student = studentRepository.save(student);

        return new StudentResponse(student);
    }

    public StudentResponse getById(int id) {
        return new StudentResponse( studentRepository.findById(id).get());
    }
}
