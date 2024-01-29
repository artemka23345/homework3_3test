package com.skypro.homework3_3test.controller;

import com.skypro.homework3_3test.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public Integer plus(Integer num1,Integer num2){
        return calculatorService.plus(num1,num2);
    }
    @GetMapping("/minus")
    public Integer minus(Integer num1,Integer num2){
        return calculatorService.minus(num1,num2);
    }
    @GetMapping("/multiply")
    public Integer multiply(Integer num1,Integer num2){
        return calculatorService.multiply(num1,num2);
    }
    @GetMapping("/divide")
    public Double divide(Double num1,Double num2){
        return calculatorService.divide(num1,num2);
    }

}
