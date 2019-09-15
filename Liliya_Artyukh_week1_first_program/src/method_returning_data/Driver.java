package method_returning_data;

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
		
		int sum = addTwoNumbers(num1, num2);
		
		System.out.println("The sum of two numbers is " + sum);
		scanner.close();
	}

	
	public static int addTwoNumbers(int num1, int num2) {
		int sum = num1 + num2;
		return sum ;

	}
}
