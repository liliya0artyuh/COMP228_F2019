package interfaces_2;

public class Bird extends Animal {
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




}
