package com.common.Exception;

import org.springframework.http.HttpStatus;

public class IllegalArgumentException extends CommonException{
    public IllegalArgumentException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
