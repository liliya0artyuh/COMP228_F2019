package abstract_things;

public class Fish extends Animal{
	int fins;
	private String type = "fish";

	@Override
	public void move() {
		System.out.println("fish is swimming");
	}
	
}
