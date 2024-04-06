package com.sandeep.productservice.exceptions.ControllerAdvices;

import com.sandeep.productservice.Dtos.NotFoundExceptionDto;
import com.sandeep.productservice.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceControllerAdvices {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionDto> handleNotFoundException(NotFoundException notFoundException){
        return new ResponseEntity<NotFoundExceptionDto>(new NotFoundExceptionDto(HttpStatus.NOT_FOUND,notFoundException.getMessage()),HttpStatus.NOT_FOUND);

    }
}
