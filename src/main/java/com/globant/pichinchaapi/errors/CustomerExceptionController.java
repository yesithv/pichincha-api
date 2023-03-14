package com.globant.pichinchaapi.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionController {

    @ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity<Object> exception(CustomerNotFoundException exception) {

        return new ResponseEntity<>(ErrorMessage.builder()
                .errorTittle("No se encontró el cliente")
                .errorCode("CUS-001")
                .errorMessage(exception.getMessage())
                .build(),
                HttpStatus.NOT_FOUND);
    }

}
