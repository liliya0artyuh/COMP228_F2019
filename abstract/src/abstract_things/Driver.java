package abstract_things;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setLegs(2);
		dog.setType("dog");
		
		MovementService.makeItMove(dog);
		
		Fish fish = new Fish();
		MovementService.makeItMove(fish);
		
		System.out.println("-------------------------");
		
		ArrayList<Animal> animalsCollection = new ArrayList<Animal>();
		
		Bird bird = new Bird();
		//Animal animal = new Bird();
		
		Frog frog = new Frog();
		
		animalsCollection.add(dog);
		animalsCollection.add(fish);
		animalsCollection.add(bird);
		//animalsCollection.add(animal);
		animalsCollection.add(frog);
		
		MovementService.makeItMove(animalsCollection);
		System.out.println(Animal.SUPERCLASS);
		
	}

}
