package method_with_parameters;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int num1 ;
		int num2 =0 ;
		System.out.println("Please enter number 1");
		num1 = scanner.nextInt();
		
		System.out.println("Please enter number 2");
		num2 = scanner.nextInt();
		
		addTwoNumbers(num1, num2);
		
		scanner.close();
	}

	
	public static void addTwoNumbers(int num1, int num2) {
		
		System.out.println("The sum of two numbers is " + (num1 + num2));

	}
}
