package com.skypro.homework3_3test.service.impl;

import com.skypro.homework3_3test.exeption.IllegalArgumentExceptionDivide;
import com.skypro.homework3_3test.service.CalculatorService;
import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus(Integer num1, Integer num2) {
        Integer result = num1 + num2;
        return result;
    }
    public Integer minus(Integer num1, Integer num2) {
        Integer result = num1 - num2;
        return result;
    }
    public Integer multiply(Integer num1, Integer num2) {
        Integer result = num1 * num2;
        return result;
    }
    public Double divide(Double num1, Double num2) {
        if(num2 == 0){
            throw new IllegalArgumentExceptionDivide("Деление на ноль");
        }else{
            double result = num1 / num2;
            return result;
        }

    }
}
