package oop_abstract;

public abstract class page {
	
	// we cannot create an object for abstract class.
	// we cannot override a final method
	// we can override a normal method.
	// we cannot override static method.
	
	// we can create a constructor in abstract class.
	
	// consstructor will be called when we create the object o childd class 
	
	// always default constructor is called from the parent class.
	
	// 100 % , 0 % , prtiaal abstraction is possible.
	
	//when we have some idea of business logic then we go with abstraction.
	
	// when we dont have any idea about business logic we go with interface where we just decalre methods. business logic is return in chid class.
	
	
	public page() {
		System.out.println(" DEFAULT constructor");
	}
	
	public page (int i) {
		
		System.out.println(" PAGE CONSTRUCTOR" +i);
	}
	
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void calculatePageLoadTimeOut() {
		
		System.out.println("PAGE time out");
	}
	
	
	public final void displayLogo() {
		
		System.out.println("display logo");
	}
	
	public static void displayFooter() {
		
		System.out.println("display footer");
	}
	

}
