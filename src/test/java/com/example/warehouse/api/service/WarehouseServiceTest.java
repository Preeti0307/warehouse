package com.example.warehouse.api.service;

import com.example.warehouse.model.Vegetable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WarehouseServiceTest {

    @Autowired
    WarehouseService warehouseService;

    @Test
    public void testGetVegetable(){
        Vegetable vegetable = warehouseService.getVegetables();
        assertEquals("Beans", vegetable.getName());
    }

}