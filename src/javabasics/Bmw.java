package javabasics;

public class Bmw extends Car{
	
	// bmw is the child class
	
	
	@Override
	public void start() {
		
		System.out.println("bmw -- start");
	}
	
	public void service() {
		
		System.out.println("bmw -- service");
		
	}
	
	public void warranty() {
		
		System.out.println("bmw -- warranty");
		
	}
    // we cannot override a static method.
	// if there is static method in parent class and also in child class it is called method hiding.
	//indiviuaal static method.
	
	public static void billing() {
		
		System.out.println("bmw -- billing");
		
	}
}
