package com.example.student_service.feignclients;

import com.example.student_service.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "address-service"
,path = "/api/address")
public interface AddressFeignClient {

    @GetMapping("/getbyid/{id}")
    public AddressResponse getById(@PathVariable int id);

    }
