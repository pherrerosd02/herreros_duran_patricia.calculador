package com.herreros_duran_patricia.calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() { // Create object before compilation
        calculator = new Calculator();
    }

    /*
     * testCalc() test method
     */
    @Test
    void testCalc() {
        double first = 3;
        String second = "5";

        try {
            Assertions.assertEquals(8, calculator.calc(first, second, '+', 0));
            Assertions.assertEquals(-2, calculator.calc(first, second, '-', 0));
            Assertions.assertEquals(15, calculator.calc(first, second, '*', 0));
            Assertions.assertEquals(0.6, calculator.calc(first, second, '/', 0));
            Assertions.assertEquals(3d, calculator.calc(first, second, '%', 0));
            Assertions.assertEquals(243, calculator.calc(first, second, '^', 0));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}