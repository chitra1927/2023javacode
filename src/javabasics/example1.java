package javabasics;

public class example1 {
	
	public void test() {
		System.out.println("in test method");
	}
	
	public void test(int a) {
		System.out.println("in test method");
	}
	
	public void test(int a , String b) {
		System.out.println("in test method");
	}
	
	public int  test(String a) {
		System.out.println("in test method");
		int age = -1;
		if (a.equalsIgnoreCase("chitra"))
		{
			age = 26;
		}
		else if(a.equalsIgnoreCase("veda"))
		{
			age = 30;
		}
		else
		{
			System.out.println("given name not found");
		}
		return age;
		
	}
	
	//real time use cases ex  : login feature
	public void login()
	{
		
	}
	
	public void login(String userName , String password)
	//parameters tht declared mut be used in the code.
	//it is bd partice to unnecessary declaring the variables but not using in the method.
	
	{
		
	}
	
	public void login(String userName , String password , int phoneNumber)
	{
		
	}
	
	
	// real time use cases ex : search button in amazon
	
	public void search()
	{
		
	}
	
	public void search(String productName)
	{
		
	}
	
	public void search(String productName , int price)
	{
		
	}
	
	
	//payment option
	
	public void payment()
	{
		
	}
	public void payment(int cardno , int cvv)
	{
		
	}
	
	public void payment(int phoneNumber)
	{
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method overloading is two or more methods having same name with different number of parameters or
		   //different type of parameters or
		   //with different order of the parameter
		   //return type doesnt matter.
		
		example1 e1 = new example1();
		int m = e1.test("chitra");
		System.out.println(m);
		
		int f = e1.test("VEDA");
		System.out.println(f);
		
		int h = e1.test("sai");
		System.out.println(h);
		
	
		
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
