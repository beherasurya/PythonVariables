package com.gateway.api;

import com.fasterxml.jackson.annotation.JsonValue;
import com.gateway.api.messagebody.ApiRespnse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity helloMethod(){

        return new ResponseEntity(new ApiRespnse("Hello",200),
                HttpStatus.OK);
    }

}
