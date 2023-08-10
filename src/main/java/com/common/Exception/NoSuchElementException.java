package com.common.Exception;

import org.springframework.http.HttpStatus;

public class NoSuchElementException extends CommonException{
    public NoSuchElementException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
