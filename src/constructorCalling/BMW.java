package constructorCalling;

public class BMW extends Car{
	
	//super keyword is used to call parent class constructor.
	
	// super keyword is used to call paarent class method.
	
	//superkeyword is used to access parent class variable from child class .
	
	
	
	private int totalAmount = 2000;
	
	public void amountCheck() {
		System.out.println(totalAmount);
		int oldAmount = super.totalAmount;
		System.out.println(oldAmount);
	}
	
	public BMW() {
		super("audi");
		System.out.println("Bmw car");
		
		
	}
	
	@Override
	public void speed() {
		System.out.println("BMW speed");
		super.speed();
	}
	
	
	
	
	
}