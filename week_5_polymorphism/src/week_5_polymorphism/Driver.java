package week_5_polymorphism;

public class Driver {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setLegs(2);
		dog.setType("dog");
		
		MovementService.makeItMove(dog);
		
		Fish fish = new Fish();
		MovementService.makeItMove(fish);
		
	}

}
