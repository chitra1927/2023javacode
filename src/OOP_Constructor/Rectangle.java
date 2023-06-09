package OOP_Constructor;


public class Rectangle {
	
	//What is the purpose of a default constructor in Java? 
	// if there is an object and no constructor is coded then compiler creates the default constructor.
	//How can you differentiate between a default constructor and a constructor that takes in parameters?
	//to call parameterized constructor we pass values while creating the object.
	//What is the access level of a constructor in Java?
	// public , private, protected , and package level.
	// a public access level can be used in any part of the program.
	// private access level can be used only inside the same class in which it is declared.
	// protected access level can be used in any part of the program in the same package and inside any descendant class in any package.
	//package-level access can be used inside the same package in which its class is declared.
	//Can a constructor be private? If so, why would you want to make a constructor private?
	// yes , constructor can be private but if there a child class overriding the parent class constructor that causes error.
	//Can a constructor call a method from another class?
	// no . 
	
	
	
	
	
	
	
	
		double length;
		double width;
		
		public Rectangle() {
			
		}

		public Rectangle(double length, double width) {
			this.length = length;
			this.width = width;
			
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Rectangle  obj = new Rectangle();
			obj.length= 0.0;
			obj.width= 0.0;
			
			
			Rectangle  obj1 = new Rectangle(10,10);
			
			double t =obj1.calculateArea();
			System.out.println(t);
			
		

		}
		
		
		public double calculateArea() {
			
			double area = length * width;
			return area;
			
		}

	}


