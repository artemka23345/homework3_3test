package com.skypro.homework3_3test.controller;

import com.skypro.homework3_3test.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String hello(){
        return calculatorService.hello();
    }
    @GetMapping("/plus")
    public String plus(Integer num1, Integer num2){
        return num1 + "+" + num2 + "=" + calculatorService.plus(num1,num2);
    }
    @GetMapping("/minus")
    public String minus(Integer num1, Integer num2){
        return num1 + "-" + num2 + "=" + calculatorService.minus(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2){
        return num1 + "*" + num2 + "=" + calculatorService.multiply(num1,num2);
    }
    @GetMapping("/divide")
    public String divide(Double num1, Double num2){
        return num1 + "/" + num2 + "=" + calculatorService.divide(num1,num2);
    }

}
