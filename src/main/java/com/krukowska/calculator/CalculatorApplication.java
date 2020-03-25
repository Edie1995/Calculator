package com.krukowska.calculator;

import com.krukowska.calculator.controllers.CalculatorController;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class CalculatorApplication {
    private static final Logger log = LogManager.getLogger(CalculatorApplication.class);
    public static void main(String[] args) {
        log.error("odpalilem sie !!!");
        SpringApplication.run(CalculatorApplication.class, args);

    }

}
