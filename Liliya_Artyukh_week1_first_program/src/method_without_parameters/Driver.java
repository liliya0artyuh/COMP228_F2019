package method_without_parameters;

import java.util.Scanner;

public class Driver {
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter number 1");
		num1 = scanner.nextInt();
		
		System.out.println("Please enter number 2");
		num2 = scanner.nextInt();
		
		addTwoNumbers();
		
		scanner.close();
	}

	
	public static void addTwoNumbers() {
		
		System.out.println("The sum of two numbers is " + (num1 + num2));

	}
}
