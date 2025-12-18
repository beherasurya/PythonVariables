package com.cab.book.driver.service;

import com.cab.book.driver.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CabLocationService {


    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateLocation(String location){

        kafkaTemplate.send(AppConstant.DRIVER_MESSAGE,location);
        return true;
    }
}
