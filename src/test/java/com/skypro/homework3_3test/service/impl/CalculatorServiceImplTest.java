package com.skypro.homework3_3test.service.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {
    public final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void hello() {
        String hello = "Добро пожаловать в калькулятор";
        assertEquals(hello, out.hello());
    }
}
