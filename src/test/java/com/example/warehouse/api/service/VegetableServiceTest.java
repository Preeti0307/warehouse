package com.example.warehouse.api.service;

import com.example.warehouse.model.Vegetable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class VegetableServiceTest {

    @Autowired
    VegetableService vegetableService;

    @Test
    public void testGetVegeNameAndPrice(){
        Vegetable vegetable = vegetableService.getVegeNameAndPrice();
        assertEquals("Cauliflower", vegetable.getName());
        assertEquals(new BigDecimal(15), vegetable.getPrice());
    }

}