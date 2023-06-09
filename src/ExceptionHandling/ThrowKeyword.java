package ExceptionHandling;

public class ThrowKeyword {
	
	public void m1() {
		System.out.println(" M1 METHOD");
		m2();
		
	}
	
	public void m2() {
		System.out.println("M2 METHOD");
		try {
		      m3();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("M3 Method");
		int i = 9/0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowKeyword obj = new ThrowKeyword();
		obj.m1();
		System.out.println("bye");

	}

}
