package javabasics;

public class constructorExample {
	
	
	//constructor name is same as class name
	//it does not have return type
	//constructor will be called when there is an object 
	//constructor can be overloaded
	// What is the purpose of a constructor in Java? : to restrict the creation of object.
	//How does a constructor differ from a regular method in Java? : constructor name is same as class name and 
	//constructor will be called when there is an object 
	//Can a Java class have multiple constructors? If so, how are they differentiated? : with same name and different parameters.
	//What happens if a constructor is not defined in a Java class? : compiler inserts the default constructor.
	//Can a constructor call other methods or constructors within the same class?  : yes we can.
	
	public constructorExample(String name) {
		
	System.out.println("In constructor method" + name);
	
	constructorExample c2 = new constructorExample("chitra",10);
	
	}
	
	public constructorExample(String name , int age) {
		
		System.out.println("In constructor method" + name + age);
		printinfo();
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorExample c1 = new constructorExample("chitra");
		
	
		
	}
	
	public void printinfo() {
		
		System.out.println("hello constructor");
		
	}

}
