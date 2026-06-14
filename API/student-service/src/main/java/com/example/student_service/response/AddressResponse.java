package com.example.adress_service.response;

import com.example.adress_service.entity.Address;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddressResponse {

    private int addressId;
    private String street;
    private String city;

    public AddressResponse(Address address){
        this.addressId = address.getId();
        this.city = address.getCity();
        this.street = address.getStreet();
    }
}
