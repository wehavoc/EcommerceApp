package com.ujjwal.Ujjwal.Ecommerce.exception;

import io.micrometer.core.instrument.config.validate.Validated;

public class InvalidCredentialsException extends RuntimeException{
    public InvalidCredentialsException(String message){
        super(message);
    }
}
