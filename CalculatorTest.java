package com.pbasco.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setOperandOne(10.5);
		calculator.setOperation("-");
		calculator.setOperandTwo(10.1);
		calculator.performOperation();
		calculator.getResults();
	}
}
