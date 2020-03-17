package com.krukowska.calculator.services;

import com.krukowska.calculator.model.EquationResult;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public EquationResult add(int val1, int val2) {
        EquationResult equationResult = new EquationResult(val1 + val2);
        return equationResult;
    }

}
