package javabasics;

public class Employee {
	
	String name;
	int age;
	static final String Officename = "capgemini";
	double salary;
	static final String ceo = "Aiman Ezzat";
	boolean isfulltime;
	char gender;
	float bonus;
	byte certifications;
	
	//default value of string is null
	//default value of int is 0
	//default value of double and float is 0.0
	//default value of boolean is false
	//default value of char
	//default value of byte is 0
	/*default value of char is null character '\u0000'  */
	//Employee e1 = new Employee()
	//new Employee();// object with no reference
	//Employee e2; // reference with no object
	/* Employee e3 = new Employee();
		e3=null;// null reference object */
	//System.gc();
	
	//static is the common property for all the object but object doesnot hold the static property.
	//static variable is stored in cma and only one copy copy is given to all the objects.
	// we we declare a variable can final we cant change the value it is fixed.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e1 = new Employee(); // employee with reference
		e1.name = "chitra";
		e1.age = 26;
		e1.salary= 100000;
		e1.isfulltime = false;
		e1.gender = 'f';
		e1.bonus = 3000;
		e1.certifications = 3;
		
	    System.out.println(e1.name);
	    System.out.println(e1.age);
	    System.out.println(e1.salary);
	    System.out.println(e1.isfulltime);
	    System.out.println(e1.gender);
	    System.out.println(e1.bonus);
	    System.out.println(e1.certifications);
	    
	    //how to acess static variable
	    
	    System.out.println(Employee.Officename);
	    System.out.println(Employee.ceo);
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
