package com.skypro.homework3_3test.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalArgumentExceptionDivide extends IllegalArgumentException {
    public IllegalArgumentExceptionDivide(String s) {
        super(s);
    }

}
