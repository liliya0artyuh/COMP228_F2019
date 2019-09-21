package composition;

public class Driver {

	public static void main(String[] args) {
		Animal anima = new Animal();
		anima.setHead("Black");

		Body body = new Body("long");

		anima.setBody(body);
		
		System.out.println(anima.getInformation());
	}

}
