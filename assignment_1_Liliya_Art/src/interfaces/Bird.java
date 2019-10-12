package interfaces;

public class Bird extends Animal implements Flyable{
	private int wings;

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	
	@Override
	public void move() {
		System.out.println("bird is flying");
	}

	@Override
	public void fly() {
		System.out.println("Bird is flying (interface implementation)");
	}



}
