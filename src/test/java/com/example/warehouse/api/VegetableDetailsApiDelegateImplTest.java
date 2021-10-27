package com.example.warehouse.api;

import com.example.warehouse.api.service.VegetableService;
import com.example.warehouse.model.Vegetable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class VegetableDetailsApiDelegateImplTest {

    @Autowired
    VegetableDetailsApiDelegate vegetableDetailsApiDelegate;

    @MockBean
    VegetableService vegetableService;

    @Test
    public void testGetVegeNameAndPrice(){
        Vegetable vegetable = new Vegetable();
        vegetable.setName("Bhindi");
        vegetable.setPrice(new BigDecimal(12));
        Mockito.when(vegetableService.getVegeNameAndPrice()).thenReturn(vegetable);

        ResponseEntity<Vegetable> vegetableResponseEntity = vegetableDetailsApiDelegate.getVegeNameAndPrice();
        assertEquals(HttpStatus.OK,vegetableResponseEntity.getStatusCode());
        assertEquals("Bhindi", vegetableResponseEntity.getBody().getName());
        assertEquals(new BigDecimal(12), vegetableResponseEntity.getBody().getPrice());
    }

}