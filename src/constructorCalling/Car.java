package constructorCalling;

public class Car {
	
	String name;
	int price;
	int totalAmount = 1000;
	
	public void speed() {
		System.out.println("Car speed");
	}
	public Car(String name) {
		System.out.println(name);
		this.name = name;
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Car() {
		System.out.println("car constructor");
	}
	
	
	
	

}
