package Asssignments;

public class constructorExample2 {
	
	double length;
	double width;
	
	// no argument contructor 
	public constructorExample2() {
		
		
	}

	public constructorExample2(double length, double width) {
		this.length = length;
		this.width = width;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorExample2  obj = new constructorExample2();
		obj.length= 0.0;
		obj.width= 0.0;
		
		
		constructorExample2  obj1 = new constructorExample2(10,10);
		
		double t =obj1.calculateArea();
		System.out.println(t);
		

	}
	
	
	public double calculateArea() {
		
		double area = length * width;
		return area;
	}

}
