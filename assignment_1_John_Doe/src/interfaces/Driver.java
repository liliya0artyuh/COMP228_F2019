package interfaces;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Animal bird1 = new Bird();
		
		Bird bird2 = new Bird();
		Flyable plane = new Plane();
		((Plane)plane).showmeSmt();
		
		ArrayList<Flyable> flyableCollection = new ArrayList<Flyable>();
	
		flyableCollection.add(bird2);
		flyableCollection.add(plane);
		
		MovementService.makeItFly(flyableCollection);


		
	}

}
