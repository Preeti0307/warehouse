package com.example.warehouse.api.service;

import com.example.warehouse.model.Vegetable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Slf4j
@Service
public class VegetableService {

    public Vegetable getVegeNameAndPrice(){
        log.info("Service getVegeNameAndPrice to fetch name and price of vegetable");
        Vegetable vegetable = new Vegetable();
        vegetable.setName("Cauliflower");
        vegetable.setPrice(new BigDecimal(15));
        return vegetable;
    }
}
