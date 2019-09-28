package arrays_3;

public class ArrayExamples {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("---------- exampleWithConstant() ----------------");
		exampleWithConstant();
		System.out.println();
		System.out.println();
		System.out.println("---------- exampleBarChart() ----------------");
		exampleBarChart();
		System.out.println();
		System.out.println();
		System.out.println("---------- exampleSummingUp() ----------------");
		exampleSummingUp();
	}

	public static void exampleWithConstant() {
		final int ARRAY_LENGTH = 10; // declare constant
		int[] array = new int[ARRAY_LENGTH]; // create array
// calculate value for each array element
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 + (2 * counter);
		}
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
// output each array element's value
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

	public static void exampleBarChart() {
// Bar chart printing method.
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		System.out.println("Grade distribution:");
// for each array element, output a bar of the chart
		for (int counter = 0; counter < array.length; counter++) {
// output bar label ("00-09: ", ..., "90-99: ", "100: ")
			if (counter == 10) {
				System.out.printf("%5d: ", 100);
			} else {
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			}
// print bar of asterisks
			for (int stars = 0; stars < array[counter]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exampleSummingUp() {
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;
// add each element's value to total
		for (int counter = 0; counter < array.length; counter++) {
			total += array[counter];
		}
		System.out.printf("Total of array elements: %d%n", total);
	}
}