
public class Student {

	
	String firstName;
	String lastName;
	String Eposta;
	static String StudentNumber;
	
	
	public  Student (  String firstName, String lastName,  String Eposta,String StudentNumber) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.Eposta = Eposta;
		this.StudentNumber= StudentNumber;
		
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEpoosta() {
		return Eposta;
	}
	public void setEpoosta(String epoosta) {
		Eposta = epoosta;
	}
	public static String getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(String StudentNumber) {
		this.StudentNumber = StudentNumber;
	}
}
