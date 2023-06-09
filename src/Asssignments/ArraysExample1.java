package Asssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // removing an element from array.
		
	
		
	int p[] = {1,4,5,2,3,22,31,2};
	System.out.println(p.length);
	
    int q[] = new int[p.length-1];
    
    int j = 5;
    
	for(int i = 0,k=0;i<p.length;i++) {
		
		
		if(i!=j)
		{
	          q[k] = p[i];
	          k++;
		}
			
	}
	System.out.println(Arrays.toString(p));
	System.out.println(Arrays.toString(q));
	
	/*
	//Write a program to create a static Array, having following cricket data:
    //
	//	                        --name, age, team name, DOB, gender, Strike Rate

	//	                        --Try to create multiple Object Arrays for different players 

		                        --Try to print all the values of each player on the console   */
	int a[] = new int[5];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 12;
	
	System.out.println(Arrays.toString(a));
	
	int b[] = {10,20,30,40,50};
	
	Object obj[] = new Object[6];
	obj[0]="chitra";
	obj[1]=26;
	obj[2]="womenpower";
	obj[3]="19/12/1996";
	obj[4]='f';
	obj[5]=7;
	
	Object obj1[] = new Object[6];
	obj1[0]="veda";
	obj1[1]=30;
	obj1[2]="men mania";
	obj1[3]="12/8/1992";
	obj1[4]='m';
	obj1[5]=7;
	
	System.out.println(Arrays.toString(obj));
	System.out.println(Arrays.toString(obj1));
	
	/*
	 Write a Java program to create a new array list,

                 --add some colors (string) 

                ---and print out the colorslist.*/
	
	ArrayList<String> colors= new ArrayList<String>();
	
	colors.add("red");
	colors.add("white");
	colors.add("yellow");
	
	System.out.println(colors);
	
	/*
	 
	Write a Java program to retrieve an element at a specified index from a given array list. */
	/*3. Write a Java program to update specific array element by given element. */
	/*4. Write a Java program to remove the third element from an array list.  */
	
	ArrayList<String> names = new  ArrayList<String>(Arrays.asList("chitra","veda","sai","bhuv"));
	System.out.println(names.get(2));
	System.out.println(names.size());
	names.add(0,"bhavana");
	System.out.println(names);
	names.remove(3);
	System.out.println(names);
	
	
	/*6. Reverse this array List: */
	
	ArrayList<String> StudentNames = new  ArrayList<String>();
	
	StudentNames.add("vathi");
	StudentNames.add("chitra");
	StudentNames.add("duttala");
	
	Collections.reverse(StudentNames);
	System.out.println(StudentNames);
	
	/*Write a Java program to empty an array list */
	
	StudentNames.clear();
	
	System.out.println(StudentNames);
	
	/* Write a Java program to trim the virtual capacity of an array list the current list size.*/
	
	/*10. Write a Java program to print all the elements of an ArrayList using the position of the elements */
	//trims (sets) the capacity of the arraylist equal to the number of elements in the arraylist. 
	ArrayList<String> arr2 = new  ArrayList<String>();
	arr2.add("chitra");
	arr2.add("sai");
	arr2.add("veda");
	arr2.add("bhavana");
	arr2.add("jaya");
	
	arr2.trimToSize();
	
	
	for(int i=0;i<arr2.size();i++)
	{
		System.out.println(arr2.get(i));
	}
	
	System.out.println(arr2.size());
	
	arr2.add("swapna");
	
	arr2.add("divya");
	
	arr2.add("devi");
	
	
	System.out.println(arr2);
	// sublist function to extract the portion of the array.
	
	List<String> arr3 = new ArrayList<String>(Arrays.asList("chitraa","sai","veda"));
	
	List<String> sub_list = arr3.subList(0,1);
	System.out.println(sub_list);
	
	// Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
