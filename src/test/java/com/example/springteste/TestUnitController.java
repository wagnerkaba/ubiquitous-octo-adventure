package com.example.springteste;

import com.example.springteste.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUnit(){
        TestController controller = new TestController();
        String resultado = controller.saudacao("Joao");
        assertEquals("Bem vindo, Joao", resultado);
    }
}
