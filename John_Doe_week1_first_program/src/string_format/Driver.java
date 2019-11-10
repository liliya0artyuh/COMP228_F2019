package string_format;

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
		
		String message = getMessage(name, num1, num2);

		System.out.println(message);
		
		scanner.close();
	}

	private static String getMessage(String name, int num1, int num2) {
		String message =
				String.format("Welcome, %s, to Java Programming! The sum is %d", name, (num1 + num2));
		return message;
	}

}
