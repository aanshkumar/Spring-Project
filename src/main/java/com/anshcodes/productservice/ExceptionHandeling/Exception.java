package com.anshcodes.productservice.ExceptionHandeling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class Exception extends java.lang.Exception {

    public Exception() {
        super("Product Not found");
    }
}
