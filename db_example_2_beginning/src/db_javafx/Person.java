package db_javafx;

public class Person {
	   private int addressID;
	   private String firstName;
	   private String lastName;
	   private String email;
	   private String phoneNumber;

	   // constructor
	   public Person() {}

	   // constructor
	   public Person(int addressID, String firstName, String lastName, 
	      String email, String phoneNumber) {
	      this.addressID = addressID;
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.email = email;
	      this.phoneNumber = phoneNumber;
	   }
	   
	   public Person(int addressID, String firstName, String lastName) {
			      this.addressID = addressID;
			      this.firstName = firstName;
			      this.lastName = lastName;
			   }

	   // sets the addressID
	   public void setAddressID(int addressID) {this.addressID = addressID;}

	   // returns the addressID 
	   public int getAddressID() {return addressID;}
	   
	   // sets the firstName
	   public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }

	   // returns the first name 
	   public String getFirstName() {return firstName;}
	   
	   // sets the lastName
	   public void setLastName(String lastName) {this.lastName = lastName;}

	   // returns the last name 
	   public String getLastName() {return lastName;}
	   
	   // sets the email address
	   public void setEmail(String email) {this.email = email;}

	   // returns the email address
	   public String getEmail() {return email;}
	   
	   // sets the phone number
	   public void setPhoneNumber(String phoneNumber) {
	      this.phoneNumber = phoneNumber;
	   } 

	   // returns the phone number
	   public String getPhoneNumber() {return phoneNumber;}

//	@Override
//	public String toString() {
//		return "Person [addressID=" + addressID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
//				+ email + ", phoneNumber=" + phoneNumber + "]";
//	}
	@Override
	public String toString() {
		return "Person [addressID=" + addressID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + "]";
	}

	}
