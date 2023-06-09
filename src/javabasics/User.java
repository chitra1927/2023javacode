package javabasics;

public class User {
	
	//global variables or class variables
	
	
	// class is a template or blueprint of object.
	//object is a instance of class . it a physical entity.
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    User u1 = new User();
    u1.name = "chitra";
    u1.age = 26;
    u1.city = "hyd";
    
    User u2 = new User();
    u2.name = "veda";
    u2.age = 30;
    u2.city = "bng";
    
    User u3 = new User();
    u3.name = "sai";
    u3.age = 28;
    u3.city = "knl";
    
    User u4 = new User();
    u4.name = "bhuv";
    u4.age = 27;
    u4.city = "delhi";
    
    u1=u2;
    System.out.println(u1.name + u1.age + u1.city);
    u2=u3;
    System.out.println(u2.name + u2.age + u2.city);
    u3=u4;
    System.out.println(u3.name + u3.age + u3.city);
    u4=u1;
    System.out.println(u4.name + u4.age + u4.city);
    
	}

}
