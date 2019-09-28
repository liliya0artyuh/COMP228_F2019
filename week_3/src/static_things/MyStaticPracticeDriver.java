package static_things;

public class MyStaticPracticeDriver {
	public static void main(String[] args) {
		System.out.println(" static number " + MyStaticPractice.number2St);
		
		
		MyStaticPractice.myStaticMethodPublicStatic();
		
		MyStaticPractice m1 = new MyStaticPractice();
		
		m1.number2St = 5;
		m1.number3 = 5;
		
		m1.setNumber4(5);
		m1.setNumber1St(5);
		
		MyStaticPractice m2 = new MyStaticPractice();
		
		System.out.println(" m2.number2St " + m2.number2St);
		System.out.println(" m2.number3 " + m2.number3);
		System.out.println(" m2.getNumber4 " + m2.getNumber4());
		System.out.println(" m2.getNumber1St " + m2.getNumber1St());
		
		System.out.println("\n\n m1.number2St " + m1.number2St);
		
		m2.number2St = 7;
		m2.number3 = 7;
		m2.setNumber4(7);
		m2.setNumber1St(7);
		
		System.out.println("\n\n m1.number2St " + m1.number2St);
		System.out.println(" m1.number3 " + m1.number3);
		System.out.println(" m1.getNumber4 " + m1.getNumber4());
		System.out.println(" m1.getNumber1St " + m1.getNumber1St());
		
		MyStaticPractice.number2St = 9;
		System.out.println("\n\n m2.number2St " + m2.number2St);
		System.out.println("\n\n m1.number2St " + m1.number2St);
		
	}
}