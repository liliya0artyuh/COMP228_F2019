package example_1;

public class Fish extends Animal{
	private int fins;

	
	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}
	
	public void swim() {
		System.out.println(this.getType() + " is swimming");
	}
}
