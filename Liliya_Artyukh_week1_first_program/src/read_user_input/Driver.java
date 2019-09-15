package read_user_input;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Your name is " + name);

		
		System.out.println();
		System.out.println("---------------------");
		
		int num1;
		int num2;
		
		System.out.println("Please enter number 1");
		num1 = scanner.nextInt();
		
		System.out.println("Please enter number 2");
		num2 = scanner.nextInt();
		
		System.out.println("The sum of two numbers is " + (num1 + num2));
		
		scanner.close();
	}

}
