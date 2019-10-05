package example_1;

public class Bird extends Animal{
	private int legs;
	private int wings;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	
	public void fly() {
		System.out.println(this.getType() + " is flying");
	}

}
