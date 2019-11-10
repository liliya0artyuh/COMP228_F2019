package interfaces;

import java.util.ArrayList;

public class MovementService {

	public static void makeItMove(Animal animal) {
		animal.move();
	}

	public static void makeItFly(ArrayList<Flyable> flyableArray) {
		for (Flyable item : flyableArray) {
			item.fly();
		}
	}
}
