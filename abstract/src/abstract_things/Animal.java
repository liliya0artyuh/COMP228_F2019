package abstract_things;

public abstract class Animal {
	public static final String SUPERCLASS = "Animal";

	public abstract void move();
	
	
	public void eat() {
		System.out.println("eat");
	}
}
