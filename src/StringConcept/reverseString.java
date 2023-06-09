package StringConcept;

import ExceptionHandling.MyException;

public class reverseString {
	
	public static String reverse1(String st)
	{
		
		if(st == null)
		{
			System.out.println("ENTERED VALUE SHOULD NOT BE NULL");
			throw new MyException("null pointer exception");
		}
		
		
		if(st.length() == 1) {
			
			System.out.println(st);
			return st;
			
		}
		else if (st.length() ==0) {
			
			System.out.println("entered value is null , please enter the correct value");
			return "-1";
			
		}
		
	
		String rev="";
		for(int i = st.length()-1; i>=0;i++) {
			
			
			rev= rev+st.charAt(i);
		}
		
		return rev;
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseString.reverse1("chitra");
		
		
		

	}

}
