package javabasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rawtype means we can store any type of data.
		//add to add the elements into arraylist
		//get is to retrieve the elements from the arraylist.
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("chitra");
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		for(int i=0; i<ar.size();i++)	
		{
			System.out.println(ar.get(i));
			
		}
		
		//generic means we can store only particular type of data.
		
		
		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(200);
		markList.add(300);
		markList.add(400);
		
		for(int i=0; i<markList.size();i++)	
		{
			System.out.println(markList.get(i));
			
		}
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("ie");
		
		for(int i=0; i<browserList.size();i++)	
		{
			System.out.println(browserList.get(i));
			
		}
		
		//object array to store all type of data
		
		ArrayList<Object> employeeList = new ArrayList<Object>();
		employeeList.add("chitra");
		employeeList.add("100");
		employeeList.add("hyderabad");
		
		for(int i=0; i<employeeList.size();i++)	
		{
			System.out.println(employeeList.get(i));
			
		}
		
		
		// features of arraylist: add to the element into the array and remove to remove the element
		//Array.addList() to add the group of elements 
		
		
	     ArrayList<String> employeeData = new ArrayList<String>(Arrays.asList("jaya","mohan","trinethra"));
	     
	     employeeData.add("veda");
	     employeeData.add("chitra");
	     employeeData.add("sai");
	     employeeData.add("bhuv");
	     System.out.println(employeeData);
	     employeeData.remove("chitra");
	     System.out.println(employeeData);
	     employeeData.add(0,"ramu");
	     System.out.println(employeeData);
	     employeeData.remove(1);
	     System.out.println(employeeData);
	     
	     // Another way of adding data using Arrays.asList
	     
	     
	     List<Integer> nums = Arrays.asList(10,8,30,1,50);
	     Collections.sort(nums);
	     
	     System.out.println(nums);
	     
	     Collections.reverse(nums);
	     
	     System.out.println(nums);
	     
		
		
		
		 List<String> abc = Arrays.asList("chitra","hyd");
		 
		 // collection . sort to sort the arraylist
		 //collection . reverse to reverse the arraylist
		 
		  // how to sort static array
		 
		 
		  int numbers[] = new int[3];
		  numbers[0] = 10;
		  numbers[1]= 200;
		  numbers[2]=3;
		  Arrays.sort(numbers);
		  System.out.println(Arrays.toString(numbers));
		  
		  
		  //how to copy arraylist element in particular number of times.
		  
		  ArrayList<String> Data = new ArrayList<String>(Collections.nCopies(10,"chitra"));
		  
		  System.out.println(Data);
		  
		  
				  
		 
		 
		 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
