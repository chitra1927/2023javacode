package Asssignments;

public class personTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		person p1 = new person();
		p1.setName("chitra");
		p1.setAge(26);
		p1.setGender("female");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	    System.out.println(p1.getGender());
		
	    p1.printInfo();
		
				
	}

}
