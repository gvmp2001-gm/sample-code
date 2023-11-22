package com.ofss.util;

import java.util.Scanner;

public class CalculationUtillity {
	private int number1;
	private int number2;
	private int result;
	
	public CalculationUtillity() {
		System.out.println("Constructor called");
	
	}
	
	
	
	public CalculationUtillity(int number1, int number2) {
		System.out.println("Overloaded constructor");;
		this.number1 = number1;
		this.number2 = number2;
	}



	public void accept(int num1, int num2) {
	System.out.println("accept() of CalculationUtility");
	number1= num1;
	number2= num2;
	}
	public void calculate() {
		System.out.println("Calculate()  of Calculationutility");
		result = number1+number2; 

	}
	public int display() {
		System.out.println("display() of CalculationUtility");
		return result;
	}
}
