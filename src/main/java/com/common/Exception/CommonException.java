package com.common.Exception;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;

    public CommonException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    public String getMessage() {
        return message;
    }
}
