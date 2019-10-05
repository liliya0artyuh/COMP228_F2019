package example_1;

public class Dog extends Animal {
	private int legs;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void run() {
		System.out.println(this.getType() + " is running");
	}
	
}
