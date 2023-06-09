package ExceptionHandling;

public class multipleTryCatch {
	
	
	// TRY AND CATCH SHOULD COME TOGETHER
	//try can have multiple catch blocks.
	//once the exception occurs remaining statements in the try block wont be executed.
	
	
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("CHITRA");
		
		try {
			multipleTryCatch obj = new multipleTryCatch();
			obj= null;
			obj.age = 20;
			int i = 9/0;
			System.out.println("SAI");
			
		}
		catch(ArithmeticException e) {
		
		System.out.println("AE Exception");
		e.printStackTrace();
			
		}
		catch(NullPointerException e) {
			
			System.out.println("NPE Exception");
			e.printStackTrace();
			
		}
		
		System.out.println("BYE");
		

	}

}
