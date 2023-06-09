package constructorCalling;

//this keyword:

//1.this keyword is used in constructor to intialize the class variables with local variables.
//2.this keyword is used in getter /setter in encapsulation.
//3.this keyword is used in constructor to call the constructor of the same class.
//4.constructor is used in builder pattern.
//this() should write in first line and only we can call one method.

public class Employee {
	
	String name;
	int age;
	String city;
	
	public Employee(String name) {
		this("chitra",10,"banglore");
		this.name = name;
		
	}
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	
	
	
	

}
