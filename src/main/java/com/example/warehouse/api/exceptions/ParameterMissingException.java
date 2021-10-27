package com.example.warehouse.api.exceptions;

import com.example.warehouse.model.Error;

public class ParameterMissingException extends RuntimeException {
    public Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public ParameterMissingException(Error error){
        super(error.getMessage());
        this.error = error;
    }

}
