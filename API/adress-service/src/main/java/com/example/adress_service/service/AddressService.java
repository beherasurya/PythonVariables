package com.example.adress_service.service;

import com.example.adress_service.entity.Address;
import com.example.adress_service.repository.AddressRepository;
import com.example.adress_service.request.CreateAddressRequest;
import com.example.adress_service.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
        Address address = new Address();
        address.setCity(createAddressRequest.getCity());
        address.setStreet(createAddressRequest.getStreet());
        addressRepository.save(address);

        return new AddressResponse(address);
    }

    public AddressResponse getById(int id) {

        return new AddressResponse(addressRepository.findById(id).get());
    }
}
