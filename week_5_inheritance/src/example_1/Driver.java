package example_1;

public class Driver {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setColor("brown");
		dog.setType("dog");
		dog.eyes = 2;
		dog.setLegs(4);
		
		Fish fish = new Fish();
		fish.setColor("gold");
		fish.setType("fish");
		fish.eyes = 2;
		fish.setFins(2);
		
		System.out.println(dog.getType() +", " + dog.getColor() + ",  " + dog.getLegs() + " , " + dog.eyes);
		System.out.println(fish.getType() + ", "+ fish.getColor() + ",  " + fish.getFins() + " , " + fish.eyes);


		Bird bird = new Bird();
		bird.setColor("brown");
		bird.setType("bird");
		bird.eyes = 2;
		bird.setLegs(4);
		
		dog.run();
		dog.sleep();
		
		fish.swim();
		fish.eat();
		
		bird.fly();
		bird.eat();
		
		
		System.out.println(dog);
		
	}

}
