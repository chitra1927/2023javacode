package Asssignments;

public class person {
	
	private String name;
	private int age;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void printInfo() {
		
		System.out.println("name is chitra");
		
		System.out.println("age is 26");
		
		System.out.println("gender is female");
		
	}

}
