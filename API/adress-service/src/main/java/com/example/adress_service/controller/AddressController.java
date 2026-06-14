package com.example.adress_service.controller;

import com.example.adress_service.request.CreateAddressRequest;
import com.example.adress_service.response.AddressResponse;
import com.example.adress_service.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
@Slf4j
public class AddressController {


    @Autowired
    private AddressService addressService;

    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest){
        return  addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/getbyid/{id}")
    public AddressResponse getById(@PathVariable int id){
        log.info("Inside getById "+id);
        return addressService.getById(id);
    }

}
