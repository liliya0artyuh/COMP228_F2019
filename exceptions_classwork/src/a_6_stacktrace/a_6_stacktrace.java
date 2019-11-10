package a_6_stacktrace;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class a_6_stacktrace {

	static Path path = Paths
			.get("F:\\2018\\git_code\\COMP228_003_W2018\\exceptions_classwork\\src\\checked_exceptions\\output.txt");

	public static void main(String[] args) {

		printStackTraceManually();
		System.out.println("after handeling exception code continues to execute");
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();

		printMyOwnMessage();
		System.out.println("after handeling exception code continues to execute");
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		runSomeCodeThatWillCauseexception();//comment me out to reach next line of code
		System.out.println("this line will not be printed as the code will terminate due to unhadled exception");
		System.out.println("Comment out method that causes unhandled exception above and you will be able to reach this code even though there were exceptions in previous method calls");


	}

	public static void printStackTraceManually() {
		try {
			ArrayList<String> textList = new ArrayList<String>();
			textList.add("qqqqq");
			System.out.println(textList.get(0));
			System.out.println(textList.get(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printMyOwnMessage() {
		try {
			ArrayList<String> textList = new ArrayList<String>();
			textList.add("qqqqq");
			System.out.println(textList.get(0));
			System.out.println(textList.get(1));
		} catch (Exception e) {
			System.out.println("My own log of the exception");
		}
	}
	
	public static void runSomeCodeThatWillCauseexception() {
		ArrayList<String> textList = new ArrayList<String>();
		textList.add("qqqqq");
		System.out.println(textList.get(0));
		System.out.println(textList.get(1));
	}
}
