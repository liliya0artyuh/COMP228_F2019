package week_5_polymorphism;

public class Dog extends Animal {
	private int legs;
	private String type = "dog";

	@Override
	public void move() {
		super.move();
		System.out.println(type + " is running ");
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
