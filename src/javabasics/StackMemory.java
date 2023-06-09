package javabasics;

public class StackMemory {
	
	
	public void method1() {
		System.out.println("In method1");
		method2(); //ns - ns  non static method method1() calling non static method method2() no object is needed.
		
	}
	
	public void method2() {
		
		//ns - s  non static method caling static method no obect needded we can call with classname.object
		
		System.out.println("In method2");
		method3();
		StackMemory.test2();
		
		
	}
	
	public void method3() {
		System.out.println("In method3");
	}
	
	public static void test1() {
		
		
		System.out.println("In test1 method");
	    test3();
	}
	
    public static void test2() {
		
		System.out.println("In test2 method");
	}
    
    public static void test3() {
		
		System.out.println("In test3 method");
	}
    
    
	
	
	
	

	public static void main(String[] args) {
		// s - ns static method main() calling non static method method1 we need object.
		
		// s- s we call directly or with class name.
		
		// TODO Auto-generated method stub
		
		StackMemory obj = new StackMemory();
		obj.method1();
		
		StackMemory.test1();
		
		
		

	}

}
