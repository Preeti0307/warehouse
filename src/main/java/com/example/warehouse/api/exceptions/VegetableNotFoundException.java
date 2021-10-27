package com.example.warehouse.api.exceptions;

import com.example.warehouse.model.Error;

public class VegetableNotFoundException extends RuntimeException {
    public Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public VegetableNotFoundException(Error error){
        super(error.getMessage());
        this.error = error;
    }

}
