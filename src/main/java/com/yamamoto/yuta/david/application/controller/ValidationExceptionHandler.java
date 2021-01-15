package com.yamamoto.yuta.david.application.controller;

import com.yamamoto.yuta.david.application.resource.ValidationError;
import com.yamamoto.yuta.david.domain.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ValidationError handler(ValidationException e) {

        return new ValidationError(e.getField(), e.getMessage());
    }
}
