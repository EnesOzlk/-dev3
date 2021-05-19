
public class User {

		int id;
		static String FirstName;
		String lastName;
		String eposta;
		

		public  User ( int id , String FirstName, String lastName,  String eposta) {
			
			this.id=id;
			this.FirstName = FirstName;
			this.lastName = lastName;
			this.eposta = eposta;
		
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public static String getFirstName() {
			return FirstName;
		}


		public void setFirstName(String FirstName) {
			this.FirstName = FirstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEposta() {
			return eposta;
		}


		public void setEposta(String eposta) {
			this.eposta = eposta;
		}
		
		
		
		
}
