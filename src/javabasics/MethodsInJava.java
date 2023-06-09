package javabasics;

public class MethodsInJava {
	
    static int car;
	
	// 1. no input no return
	
	public void test() {
		
		
		System.out.println("chitra");
	}
	
	// no input but some return
	
	public String print() {
		
		String s1 = "chitra";
		String s2 = "vathi";
		String s = s1 + s2;
		return s;
		
	}
	
	// some input and some return
	
	public int finalPayment(int intialAmount , int tax)
	{
		int totalAmount = intialAmount + tax;
		return totalAmount;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methods/functions are three types
		// 1. no input no output
		// 2. no input some output
		//3. some input and some output
		// void returns nothing
		
		MethodsInJava m1 = new MethodsInJava();
	    m1.test();
	    String h = m1.print();
	    System.out.println(h);
	    if(h.equals ("chitravathi"))
	    {
	    	System.out.println("chitra private limited");
	    }
	    int j = m1.finalPayment(20000,300);
	    System.out.println(j);
	    
	    

	    
	    
	   
	    
	    
	 
	    
		
		
		
		
		
		


	}

}
