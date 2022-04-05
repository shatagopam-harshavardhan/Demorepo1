package demo;

import java.util.Scanner;

public class calculator {

	

	public static void main(String[] args)
	{

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number:");
	double number1 = sc.nextDouble();
	System.out.print("Enter second number:");
	double number2 = sc.nextDouble();
	System.out.print("Enter an operator (+, -, *, /): ");
	char operator = sc.next().charAt(0);
	sc.close();

	double output;
	switch(operator)
	{
	case '+':
	output = number1 + number2;
	break;

	case '-':
	output = number1 - number2;
	break;

	case '*':
	output = number1 * number2;
	break;

	case '/':
	output = number1 / number2;
	break;

	default:
	System.out.print("You have entered wrong operator");
	return;
	}

	System.out.println(number1+" "+operator+" "+number2+"= "+output);
	}
	
}
