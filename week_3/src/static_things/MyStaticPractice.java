package static_things;

public class MyStaticPractice {
	private static int number1St = 1;
	public static int number2St = 2;
	public int number3 = 3;
	private int number4 = 4;

	public static int getNumber1St() {
		return number1St;
	}

	public static void setNumber1St(int number1St) {
		MyStaticPractice.number1St = number1St;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}

	public static void myStaticMethodPublicStatic() {
		System.out.println("wwwww ");
	}

	public void myStaticMethodPublicNotStatic() {
		System.out.println("rrrrr ");
	}

	private static void myStaticMethodPrivateStatic() {
		System.out.println("qqqqq ");
	}

	private void myStaticMethodPrivateNotStatic() {
		System.out.println("eeeee");
	}
}