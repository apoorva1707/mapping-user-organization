package com.example.userorgmapping.handler;

import com.example.userorgmapping.exception.ErrorDetail;
import com.example.userorgmapping.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDetail> NotFoundException(NotFoundException ex, WebRequest req) {
        ErrorDetail error = new ErrorDetail(ex.getMessage(), "404", new Date());
        return new ResponseEntity<ErrorDetail>(error, HttpStatus.NOT_FOUND);

    }
}