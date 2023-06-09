package OOP_Constructor;

public class ConstructorExample2 {
	
	String firstName;
	String lastName;
	String password;
	String phoneNo;
	String emailId;
	String city;
	
	// constructors are used to restrict the object creation.and also we use constructors to initialize the class variables
	// with initialize the class variables with local variables. 
	
	

	public ConstructorExample2(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	public ConstructorExample2(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
		

	public ConstructorExample2(String firstName) {		
		this.firstName = firstName;
	}
	


	public ConstructorExample2(String firstName, String lastName, String password,String phoneNo) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNo = phoneNo;
		
	}
	
	
	public ConstructorExample2(String firstName, String lastName, String password, String phoneNo, String emailId,
			String city) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.city = city;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ConstructorExample2   c1 = new ConstructorExample2("chitra");
		 System.out.println(c1.firstName);
		 c1.lastName="kaarnti";
		 System.out.println(c1.lastName);
		 
		 ConstructorExample2   c2 = new ConstructorExample2("chitra" ,"duttala" , "chi123" , "9849443104");
		 System.out.println(c2.firstName +c2.lastName +c2.password +c2.phoneNo);
		 
	} 

}
