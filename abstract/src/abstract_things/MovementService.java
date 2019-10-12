package abstract_things;

import java.util.ArrayList;

public class MovementService {

	public static void makeItMove(Animal animal) {
		animal.move();
	}

	public static void makeItMove(ArrayList<Animal> animalArray) {
		for (Animal item : animalArray) {
			item.move();
			if (item instanceof Dog) {
				int numOfLegsInDog = ((Dog) item).getLegs();
				System.out.println(numOfLegsInDog);
			}
		}
	}
}
