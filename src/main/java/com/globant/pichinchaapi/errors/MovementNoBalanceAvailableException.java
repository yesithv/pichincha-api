package com.globant.pichinchaapi.errors;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovementNoBalanceAvailableException extends RuntimeException {

    public MovementNoBalanceAvailableException(String message) {
        super(message);
    }

}
