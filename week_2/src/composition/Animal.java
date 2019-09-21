package composition;

public class Animal {
	private Head head;
	private String name;
	private Body body;
	
	
	public Animal() {
		super();
		this.head = new Head();
		this.name  = "defualt name";
	}


	public Head getHead() {
		return head;
	}


	public void setHead(String colorOfhair) {
		this.head.setColorOfhair(colorOfhair);
	}


	public Body getBody() {
		return body;
	}


	public void setBody(Body body) {
		this.body = body;
	}

	public String getInformation() {
		return String.format("Animal [hair color= %s, name= %s, body type= %s", head.getColorOfhair() , name ,body.getType());
	}
	
	
	
}
