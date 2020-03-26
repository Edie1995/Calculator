package com.krukowska.calculator.controllers;

import com.krukowska.calculator.model.EquationResult;
import com.krukowska.calculator.services.CalculatorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@Log4j2
public class CalculatorController {

    CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(value = "/v1/add")
    public EquationResult addNumbers(@PathParam("val1") int val1, @PathParam("val2") int val2) {
        log.info("Result method accessed");
        return calculatorService.add(val1, val2);
    }

}
