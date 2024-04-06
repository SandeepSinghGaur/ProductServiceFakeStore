package com.sandeep.productservice.Dtos;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class NotFoundExceptionDto {
    private String message;
    private HttpStatus errorCode;

    public NotFoundExceptionDto(HttpStatus errorCode, String message) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
