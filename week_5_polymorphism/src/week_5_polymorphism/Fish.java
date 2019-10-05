package week_5_polymorphism;

public class Fish extends Animal{
	int fins;
	private String type = "fish";

	@Override
	public void move() {
		System.out.println("swimming");
	}
	
}
