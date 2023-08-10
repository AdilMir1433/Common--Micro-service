package com.common.Exception;

import org.springframework.http.HttpStatus;

public class InternalException extends CommonException{
    public InternalException(String message) {
        super(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
