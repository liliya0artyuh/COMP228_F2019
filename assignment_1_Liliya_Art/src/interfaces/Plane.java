package interfaces;

public class Plane implements Flyable {

	
	@Override
	public void fly() {
		System.out.println("Plane is Flying");
	}

	
	public void showmeSmt() {
		System.out.println("something");
	}
}
