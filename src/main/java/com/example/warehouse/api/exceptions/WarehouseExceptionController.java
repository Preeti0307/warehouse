package com.example.warehouse.api.exceptions;

import com.example.warehouse.model.Error;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class WarehouseExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(VegetableNotFoundException.class)
    public ResponseEntity<Object> handleException(VegetableNotFoundException exception) {
        log.error("vegetable not found exception caught");
        return new ResponseEntity<>(exception.getError(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ParameterMissingException.class)
    public ResponseEntity<Object> handleException(ParameterMissingException exception) {
        log.error("parameter missing exception caught");
        return new ResponseEntity<>(exception.getError(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception exception) {
        log.error("all other exceptions caught");
        Error error = new Error();
        error.setCode("5001");
        error.setMessage("Server error");
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
