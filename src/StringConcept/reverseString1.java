package StringConcept;

public class reverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String revString = stringReverse("prabhas");
		
		System.out.println(revString);
		
	}
	
	public static String stringReverse(String st) {
		
		
		if(st==null) {
			
			System.out.println("ENTERED VALUE IS NULL");
		}
		
		if(st.length()==1) {
			
			return st;
			
		}
		else if(st.length()==0){
			
			System.out.println("length of the string is 0 , please enter correct value");
			return "-1";
		}
		
		else if(st.isBlank())
		{
			System.out.println("entered spaces");
			return "-2";
			
		}
		
     	String rev=" ";
		
		for(int i=st.length()-1 ; i>=0 ; i--)
		{
			System.out.println("*******");
			rev = rev + st.charAt(i);			
		}
		
		return rev;
			
	   }


	
}
