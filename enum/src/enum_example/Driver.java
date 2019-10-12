package enum_example;



public class Driver {

	public static void main(String[] args) {

		System.out.println(Material.BRICK);
		
		House house = new House();
		System.out.println(house.getMaterial());
		
		house.setMaterial(Material.WOOD);
		
		//String userInput = "WOOD";
		//house.setMaterial(userInput);
		System.out.println(house.getMaterial());

	}

}
