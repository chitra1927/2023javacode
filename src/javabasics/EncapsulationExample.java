package javabasics;

public class EncapsulationExample {
	
	private String name;
	private int age;
	private double salary;
	private char gender;
	
	//constructor 
	
	public EncapsulationExample(String name, int age, double salary, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	
	
	
	// getter and setter methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		
		this.gender = gender;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}

