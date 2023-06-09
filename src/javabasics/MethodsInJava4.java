package javabasics;

import java.util.ArrayList;

public class MethodsInJava4 {
	
	public ArrayList<String> employeeList(String companyName)
	{
		System.out.println("getting employee list of company:" +companyName);
		ArrayList<String> emplist = new ArrayList<String>();
		switch(companyName.toLowerCase().trim())
		{
		case "ibm":
			emplist.add("devi");
			emplist.add("naveen");
			emplist.add("praveen");
			break;
		case "capgemini":
			emplist.add("suguna");
			emplist.add("prasanna");
			emplist.add("devika");
			break;
		case "microsoft":
			emplist.add("kanna");
			emplist.add("Renu");
			emplist.add("Banu");
			break;
		default :
			System.out.println("Entered company is not found please enter the correct company name");
			break;	
		}
		
		return emplist;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsInJava4 m1 = new MethodsInJava4();
		ArrayList<String> arr = m1.employeeList("capgemini");
		System.out.println(arr);
		
		ArrayList<String> arr1 = m1.employeeList("ibm");
		System.out.println(arr1);
		
		ArrayList<String> arr2 = m1.employeeList("tcs");
		System.out.println(arr2);
		
	}

}
