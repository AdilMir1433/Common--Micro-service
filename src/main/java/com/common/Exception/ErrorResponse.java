package com.common.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@Setter

public class ErrorResponse {
    private String message;
    private HttpStatus code;
}
