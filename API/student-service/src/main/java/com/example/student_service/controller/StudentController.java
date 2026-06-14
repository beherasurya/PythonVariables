package com.example.student_service.controller;

import com.example.student_service.request.CreateStudentRequest;
import com.example.student_service.response.StudentResponse;
import com.example.student_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest){
        return studentService.createStudent(createStudentRequest);
    }


    @GetMapping("/getbyid/{id}")
    public StudentResponse getById(@PathVariable int id){

        return studentService.getById(id);
    }
}
