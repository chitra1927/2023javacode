package OOP_Constructor;

public class Employee {
	// Use of get method.
	//The get method returns the value of the variable name 
	//use of set method.
	//The set method takes a parameter ( newName ) and assigns it to the name variable.
	
	int id;
	
	String name;
	
	double salary;
	

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
    
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(27,"chitra",20000);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		
		e.setSalary(22000);
		System.out.println(e.getSalary());
		
		

	}

}
