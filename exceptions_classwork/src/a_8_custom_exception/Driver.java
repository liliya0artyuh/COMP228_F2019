package a_8_custom_exception;

public class Driver {

	public static void main(String[] args) {
		try {
			throwException();
		}  catch (CustomException e) {
			if(e.getCode() == 9) {
				System.out.println("do something special");
			}
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void throwException() throws Exception {
		
		try {
			CustomException cE = new CustomException();
			cE.setCode(9);
			throw cE;
		} catch (Exception e) {
			System.out.println("Catch exception and then rethrow exception");
			throw e;
		}
	}
}
