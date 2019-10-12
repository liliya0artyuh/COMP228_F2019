package interfaces_2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Animal bird1 = new Bird();
		Bird bird2 = new Bird();
		Dog dog = new Dog();
		
		ArrayList<Movable> movableCollection = new ArrayList<Movable>();
		
		movableCollection.add(dog);
		movableCollection.add(bird2);
		movableCollection.add(bird1);
		
		MovementService.makeItMove(movableCollection);

	


		
	}

}
