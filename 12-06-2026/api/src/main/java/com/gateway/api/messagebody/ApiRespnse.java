package com.gateway.api.messagebody;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiRespnse {

    private String message;
    private int statusCode;
}
