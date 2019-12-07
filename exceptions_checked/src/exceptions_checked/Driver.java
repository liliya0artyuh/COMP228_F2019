package exceptions_checked;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {
	public static void main(String[] args)  {
		// Get the file reference
		Path path = Paths.get("D:\\2019 september\\new_eclipse\\exceptions_checkedeee\\src\\exceptions_checked\\outputd.txt");

		// Use try-with-resource to get auto-closeable writer instanc
		try {
			writeToAFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				System.out.println("111111111111");
	}

	private static void writeToAFile(Path path) throws IOException   {
		BufferedWriter writer;
		System.out.println("start - ss");

				writer = Files.newBufferedWriter(path);
			writer.write("asfsdfdsfds dfdfgdfgdfgdfgdfg !!");
			writer.flush();

		System.out.println("End - ss");
	}
}
