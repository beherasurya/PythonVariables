package com.example.adress_service.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CreateAddressRequest {

    private String city;
    private String street;
}
