package example_1;

public class Animal {
	protected int eyes;
	private String color;
	private String type;
	

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void eat() {
		System.out.println(type + " is eating");
	}
	
	public void sleep() {
		System.out.println(getType() + " is sleeping");
	}
	
	
	@Override
	public String toString() {
		return "Animal [eyes=" + eyes + ", color=" + color + ", type=" + type + "]";
	}
	
	
}
