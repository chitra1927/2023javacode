package Asssignments;

public class constructorExample1 {
	
	String name;
	int age;
	char gender;
	double height;
	
	public constructorExample1(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		constructorExample1 c1 = new constructorExample1("chitra",26,'f',5.6);
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		System.out.println(c1.height);
		
		constructorExample1 c2 = new constructorExample1("sai",28,'m',5.8);
		
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.gender);
		System.out.println(c2.height);
	

	}

}
