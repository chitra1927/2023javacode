package OOP_Constructor;

public class person {
	
	String name;
	int age;
	char gender;
	double height;
	
	public person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		person c1 = new person("chitra",26,'f',5.6);
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		System.out.println(c1.height);
		
		person c2 = new person("sai",28,'m',5.8);
		
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.gender);
		System.out.println(c2.height);
	

	}

}
