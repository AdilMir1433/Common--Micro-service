package com.common.Exception;

import org.springframework.http.HttpStatus;

public class InvalidInputException extends CommonException {
    public InvalidInputException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}