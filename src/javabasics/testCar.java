package javabasics;

public class testCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.start();
		c.stop();
		c.petrolEngine();
		c.loan();
		Car.billing();
		Bmw b = new Bmw();
		b.start(); //overriden
		b.service(); //individual
		b.warranty();//individual
		b.stop();// inherited
		b.petrolEngine();//  inherited
		Bmw.billing();
		
		// top casting : parent class reference variable with child class object.
		// we have call overriden nd inherited methods but not indiviual methods.reference type check is failed.
		Car c1 = new Bmw();
		c1.start();
		c1.stop();
		c1.petrolEngine();
		c1.loan();
		
		
		
		
		//down casting : parent class object and child class reference variable.
		// down casting allowaable at compile time but throws error classcastexception during run time.
		
		
		//Bmw b1 = (Bmw)new Car();
		
		
		
		
		
		
		
		
		
		

	}

}
