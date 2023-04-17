package calculatorPackage;

import java.util.Scanner;

public class CalculatorProject {
	int a;
	int b;
	int c;

	public void userInterface() {
		System.out.println("Select the operation below::");
		System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice::");
		int choice = sc.nextInt();

		System.out.println("Enter 1st value");
		a = sc.nextInt();
		System.out.println("Enter 2nd value");
		b = sc.nextInt();
		switch (choice) {
		case 1:
			c = a + b;
			System.out.println("The Addition of" + a + " & " + b + " is " + c);
			break;
		case 2:
			c = a - b;
			System.out.println("The Subtraction of" + a + " & " + b + " is " + c);
			break;
		case 3:
			c = a * b;
			System.out.println("The Multiplication of" + a + " & " + b + " is " + c);
			break;
		case 4:
			double c = Double.valueOf(a) / Double.valueOf(b);
			System.out.println("The Division of " + a + " & " + b + " is " + c);
			break;
		default:
			System.out.println("Invalid selection");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator program");
		CalculatorProject object = new CalculatorProject();
		object.userInterface();

	}

}
