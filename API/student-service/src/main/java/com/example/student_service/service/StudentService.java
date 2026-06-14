package com.example.student_service.service;

import com.example.student_service.entity.Student;
import com.example.student_service.feignclients.AddressFeignClient;
import com.example.student_service.repository.StudentRepository;
import com.example.student_service.request.CreateStudentRequest;
import com.example.student_service.response.AddressResponse;
import com.example.student_service.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

    @Autowired
     StudentRepository studentRepository;
    @Autowired
    WebClient webClient;
    @Autowired
    AddressFeignClient addressFeignClient;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

        Student student = new Student();
        student.setFirst_name(createStudentRequest.getFirstName());
        student.setLast_name(createStudentRequest.getLastName());
        student.setEmail(createStudentRequest.getEmail());
        student.setAddressId(createStudentRequest.getAddressId());
        student = studentRepository.save(student);

        StudentResponse studentResponse = new StudentResponse(student);
//        studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
        studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));
        return studentResponse;
    }

    public StudentResponse getById(int id) {

         Student student =  studentRepository.findById(id).get();
         StudentResponse studentResponse = new StudentResponse(student);
//         studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
        studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));

         return studentResponse;
    }

    public AddressResponse getAddressById(int addressId){
     Mono<AddressResponse> addressResponseMono = webClient.get().uri("/getbyid/" +addressId)
                .retrieve().bodyToMono(AddressResponse.class);

     return addressResponseMono.block();
    }
}
