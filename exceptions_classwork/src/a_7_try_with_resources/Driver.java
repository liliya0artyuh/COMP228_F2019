package a_7_try_with_resources;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {
	static Path path = Paths
			.get("F:\\2018\\git_code\\COMP228_003_W2018\\exceptions_classwork\\src\\checked_exceptions\\output.txt");
	public static void main(String[] args) {
		writeToAFileAndTryWithResourcers();
		//just for comparison see same logic with finally block
		showExampleOfGoodPurposeOfFinallyBlock();
	}

	public static void writeToAFileAndTryWithResourcers() {

		// Use try-with-resource to get auto-closeable writer instance
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			System.out.println("ss");
			writer.write("Hello Worldhjhjjh !!");
			System.out.println("ss");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showExampleOfGoodPurposeOfFinallyBlock() {
		// example for catch or declare - catch example
		BufferedWriter writer = null;
		try {
			System.out.println("before writing to a file ");
			writer = Files.newBufferedWriter(path);
			writer.write("Hello World!!!");
			System.out.println("after writing to a file");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
