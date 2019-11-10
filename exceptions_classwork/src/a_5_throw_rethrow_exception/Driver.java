package a_5_throw_rethrow_exception;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void throwException() throws Exception {
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Catch exception and then rethrow exception");
			throw e;
		}
	}

}
