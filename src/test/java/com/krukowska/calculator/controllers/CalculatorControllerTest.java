package com.krukowska.calculator.controllers;

import com.krukowska.calculator.model.EquationResult;
import com.krukowska.calculator.services.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CalculatorService service;

    @Test
    public void shouldReturnAddingResultJSON() throws Exception {
        EquationResult equationResult = new EquationResult(2);
        given(service.add(1, 1)).willReturn(equationResult);
        mvc.perform(get("/v1/add/1/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"result\":2}")));

    }

}