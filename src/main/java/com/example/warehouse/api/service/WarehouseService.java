package com.example.warehouse.api.service;

import com.example.warehouse.model.Vegetable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WarehouseService {

    public Vegetable getVegetables(){
        log.info("Service getVegetables to fetch name");
        Vegetable vegetable = new Vegetable();
        vegetable.setName("Beans");
        return vegetable;
    }
}
