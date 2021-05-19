
public class Instructor {


	String firstName;
	String LastName;
	String age;
	
	
	
	public  Instructor (  String firstName, String lastName,  String age) {
		
		
		this.firstName = firstName;
		this.LastName = lastName;
		this.age=age;
		
		
		
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}
}
