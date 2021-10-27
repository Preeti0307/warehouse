package com.example.warehouse.api;

import com.example.warehouse.api.exceptions.ParameterMissingException;
import com.example.warehouse.api.exceptions.VegetableNotFoundException;
import com.example.warehouse.api.service.WarehouseService;
import com.example.warehouse.model.Error;
import com.example.warehouse.model.Vegetable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WarehouseApiDelegateImpl implements WarehouseApiDelegate{

    @Autowired
    WarehouseService warehouseService;

    @Override
    public ResponseEntity<Vegetable> getVegetables() {
        log.info("RestController getVegetables");
        Error error = new Error();
        /*error.setCode("4001");
        error.setMessage("Vegetable not found");
        throw new VegetableNotFoundException(error);
        error.setCode("4002");
        error.setMessage("Parameter missing");
        throw new ParameterMissingException(error);*/
        throw new RuntimeException();
        //Vegetable vegetable = warehouseService.getVegetables();

//        ResponseEntity responseEntity = new ResponseEntity(vegetable, HttpStatus.OK);
//        return responseEntity;
    }
}
