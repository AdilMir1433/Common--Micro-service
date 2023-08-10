package com.common.Exception;

import org.springframework.http.HttpStatus;

public class NullPointerException extends CommonException{
    public NullPointerException(String message) {
        super(message, HttpStatus.LENGTH_REQUIRED);

    }
}
