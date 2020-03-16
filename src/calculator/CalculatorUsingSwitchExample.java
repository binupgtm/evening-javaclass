package calculator;

import java.util.Scanner;

public class CalculatorUsingSwitchExample {

	public static void main(String[] args) {
		
		double num1, num2;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		
		num1 = Scanner.nextDouble();
		System.out.println("Enter second number:");
		num2 = Scanner.nextDouble();
		
		System.out.println("Enter an operator (+,-,*,/):");
		char operator = Scanner.next().charAt(0);
		
		Scanner.close();
		double output;
		
		switch(operator) {
		case '+':
			output = num1+num2;
			break;
		case '-':
			output =num1-num2;
			break;
		case '*':
			output =num1*num2;
			break;
		case '/':
			output = num1/num2;
			break;
		default:
		System.out.println("invalid input ");
		return;
			}
		System.out.println(num1+" "+operator+" "+num2+ " = " +output);
	}

}
