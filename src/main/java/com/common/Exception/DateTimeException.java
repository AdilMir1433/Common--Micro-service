package com.common.Exception;

import org.springframework.http.HttpStatus;

public class DateTimeException extends CommonException{
    public DateTimeException(String message) {
        super(message, HttpStatus.NOT_ACCEPTABLE);
    }
}
