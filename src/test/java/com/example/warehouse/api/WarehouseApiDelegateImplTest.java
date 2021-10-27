package com.example.warehouse.api;

import com.example.warehouse.api.exceptions.ParameterMissingException;
import com.example.warehouse.api.exceptions.VegetableNotFoundException;
import com.example.warehouse.api.service.WarehouseService;
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
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WarehouseApiDelegateImplTest {

    @Autowired
    WarehouseApiDelegateImpl warehouseApiDelegate;

    @MockBean
    WarehouseService warehouseService;

    @Test
    public void testGetVegetables(){
        Vegetable vegetable = new Vegetable();
        vegetable.setName("Okra");
        Mockito.when(warehouseService.getVegetables()).thenReturn(vegetable);

        ResponseEntity<Vegetable> responseEntity = warehouseApiDelegate.getVegetables();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Okra", responseEntity.getBody().getName());
    }

    @Test(expected = VegetableNotFoundException.class)
    public void whenExceptionThrown_thenVegetableNotFound(){
        warehouseApiDelegate.getVegetables();
    }

    @Test(expected = ParameterMissingException.class)
    public void whenExceptionThrown_thenParameterMissing(){
        warehouseApiDelegate.getVegetables();
    }

    @Test(expected = Exception.class)
    public void whenExceptionThrown_thenAllOtherExceptions(){
        warehouseApiDelegate.getVegetables();
    }

}
