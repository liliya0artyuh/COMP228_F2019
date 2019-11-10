package a_8_custom_exception;

public class CustomException extends RuntimeException {
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	

}
