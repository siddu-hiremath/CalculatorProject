package com.java.calculator;

import java.util.Scanner;
class CalulatorOperations
{
	
	protected int firstOperand;
	protected int secondOperand;
	final char operator = 0;
	static double result=0.0;
	
	
	public void add(int firstOperand,int secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		result = this.firstOperand +  this.secondOperand;
		
	}
	
	public void sub(int firstOperand,int secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		result = this.firstOperand -  this.secondOperand;
		
	}
	
	public void mul(int firstOperand,int secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		result = this.firstOperand *  this.secondOperand;
		
	}
	
	public void div(int firstOperand,int secondOperand) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		result = this.firstOperand /  this.secondOperand;
		
	}
	

}
class Operations {
	public static void main(String args[]) {
		
		CalulatorOperations c = new CalulatorOperations();

		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first operand : ");
		String userInput1 = input.nextLine();
		int firstOperand = Integer.parseInt(userInput1);
	
		System.out.print("Enter the second operand : ");
		String userInput2 = input.nextLine();
		int secondOperand = Integer.parseInt(userInput2);
	
		System.out.print("Enter the operator : ");
		char operator = input.next().charAt(0);
		
		switch (operator)
		{
			case '+':
				c.add(firstOperand, secondOperand);
				break;
			case '-':
				c.sub(firstOperand, secondOperand);
				break;
			case '*':
				c.mul(firstOperand, secondOperand);
				break;
			case '/':
				c.div(firstOperand, secondOperand);
				break;
		}
		System.out.println("the result of performed operation : " + c.result);
		
	}
}

