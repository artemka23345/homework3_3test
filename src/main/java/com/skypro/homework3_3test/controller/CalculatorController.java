package com.skypro.homework3_3test.controller;

import com.skypro.homework3_3test.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/plus")
    public Integer plus(Integer num1,Integer num2){
        return calculatorService.plus(num1,num2);
    }

}
