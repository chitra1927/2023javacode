package oop_abstract;

public class loginPage extends page{
	
	public loginPage() {
		
		System.out.println("login page default constructor");
	}
	
	public loginPage(int i) {
		System.out.println("login page constructor" +i);
	}

	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println(" Login Page");
		
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		
		System.out.println(" http://login.page");
	}
	
	@Override
    public void calculatePageLoadTimeOut() {
		
		System.out.println("Login PAGE time out");
	}
	
	// method hiding
	
    public static void displayFooter() {
		
		System.out.println("display login page footer");
	}
    
    // individual method
    
    public void numberOfImages() {
    	
    	System.out.println("dispaly no of images");
    }
	
	
	
}

	
	
	
