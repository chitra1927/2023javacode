package javabasics;

public class Car {
	
	//car is the parent class
	
	public void start() {
		System.out.println("CAR -- start");
		
	}
	
	public void stop() {
		System.out.println("CAR -- stop");
	}
	
	public void petrolEngine() {
		System.out.println("CAR -- petrolEngine");
	}
		
	//if a method is declared as final in car class then we cant override the method in child class.
	public final void loan() {
		
		System.out.println("CAR -- loan");
	}
	
	public static void billing() {
		
		System.out.println("CAR -- billing");
	}
		
	}
	


