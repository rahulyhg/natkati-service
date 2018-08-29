package com.smart.droid.natkati.naal;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NaalNotFoundException extends RuntimeException {
    public NaalNotFoundException(Integer id) {
    }
}
