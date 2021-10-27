package com.example.warehouse.api;

import com.example.warehouse.api.service.VegetableService;
import com.example.warehouse.api.service.WarehouseService;
import com.example.warehouse.model.Vegetable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class VegetableDetailsApiDelegateImpl implements VegetableDetailsApiDelegate{

    @Autowired
    VegetableService vegetableService;

    @Override
    public ResponseEntity<Vegetable> getVegeNameAndPrice(){
        log.info("RestController getVegetables");
        Vegetable vegetable = vegetableService.getVegeNameAndPrice();
        ResponseEntity responseEntity = new ResponseEntity(vegetable, HttpStatus.OK);
        return responseEntity;
    }
}
