package javabasics;

public class encapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationExample e1 = new EncapsulationExample("chitra",26,267.00,'f');
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
		
		e1.setAge(30);
		e1.setSalary(300.000);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());

	}

}
