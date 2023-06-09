package javabasics;

public class callByValueExample {
	
	String name;
	int age;
	
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void print() {
		System.out.println("hello guys");
	}
	
	public void getEmpoyleeInfo(callByValueExample c2) {
		
		c2.name="chitra";
		c2.age=30;
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callByValueExample c1 = new callByValueExample();
		c1.add(10,20);
		c1.getEmpoyleeInfo(c1);
		System.out.println(c1.name);
		System.out.println(c1.age);
		
		c1.name = "jaya";
		c1.age = 40;
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		
		
		
		
	}

}
