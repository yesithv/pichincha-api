package com.globant.pichinchaapi.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovementExceptionController {

    @ExceptionHandler(value = MovementNoBalanceAvailableException.class)
    public ResponseEntity<Object> exception(MovementNoBalanceAvailableException exception) {

        return new ResponseEntity<>(ErrorMessage.builder()
                .errorTittle("No hay saldo disponible")
                .errorCode("MOV-001")
                .errorMessage(exception.getMessage())
                .build(),
                HttpStatus.BAD_REQUEST);
    }

}
