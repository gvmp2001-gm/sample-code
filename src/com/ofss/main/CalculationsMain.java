package com.ofss.main;

import java.util.Scanner;

import com.ofss.util.CalculationUtillity;

public class CalculationsMain {
	public static void main(String[] args) {
		System.out.println("main start");
		// Creating object
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int number1 = scanner.nextInt();
		System.out.println("Enter number2");
		int number2 = scanner.nextInt();
		
		CalculationUtillity calculationUtillity = new CalculationUtillity(number1, number2);
		//calculationUtillity.accept(number1,number2);
		calculationUtillity.calculate();
		int result =calculationUtillity.display();
		System.out.println("Result is : :" + result);

		System.out.println("main end");
		details();
		grett();
		
	}
	
	public static void details() {
		System.out.println("all details are truee");

	}
	
	public static void grett() {
		System.out.println("How are you");

	}

}
