package javabasics;

public class MathematicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// when 9/2 the result is 4.5 but in java it dispaly only integer value 4 as 9 and 2 are integers.
		
		System.out.println(9/2);
		System.out.println(9.0/2);
		System.out.println(9/2.0);
		System.out.println((float)9/2);

	    // any integer values divide by zero gives arithmetic exception
		
		//System.out.println(0/0);  //ArithmeticException / by zero
		
		// System.out.println(9/0); //ArithmeticException / by zero
		
		System.out.println(0/10); //ArithmeticException / by zero
		
		// in a/b if a or b is 0.0 then we get Naan exception
		
		System.out.println(0.0/0.0);
		
		System.out.println(0/0.0);
		
		System.out.println(0.0/0);
		
	
		System.out.println(2.0/0.0); // infinity
		System.out.println(2/0.0); //infinity
		System.out.println(2.0/0); //infinity
		System.out.println(2/0); //infinity
		
		
}
}