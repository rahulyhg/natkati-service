package com.smart.droid.natkati.naal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NaalNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(NaalNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(NaalNotFoundException ex) {
        return ex.getMessage();
    }
}
