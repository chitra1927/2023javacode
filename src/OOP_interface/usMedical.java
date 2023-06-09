package OOP_interface;

public interface usMedical {
	
	// interface provides abstraction.
	// interface consists of only method declaration.
	//no method body
	// we cannot create an object for interface.
	//we cannot create an constructor for interface.
	// in interface variable is static and final by default.
	
	int min_fee = 50;
	public void cardicServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	// after jdk 1.8
	//we can have static method with method body 
	
	public static void print() {
		
		System.out.println("print all the medical services");
	}
	
	//we can have default method
	
	default void allDoctors() {
		
		System.out.println("print all the doctors in us medical");
	}
	
	
	
	

}
