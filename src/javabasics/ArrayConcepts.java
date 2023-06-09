package javabasics;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* array stores similar datatype values in a array variable 
		  index vlue starts from 0 nd end with n-1 
		  if the size of array does not exist it will through index out of bound exception */
		
		/* disadvantage  - size is fixed in a static array (to overcome this we use dynamic array or arraylist)
		   in array we can store only values of similar datatype (to overcome this we have object array) */
		
		/* Array literal is used when we know the data            */
		
		/* arrays.toString : string representation consists of list of array elements in [] brakets  */
		
		
		
		int i[] = new int[4];
	    i[0] = 10;
	    i[1] = 20;
	    i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println("********************");
		System.out.println(i.length);
		System.out.println("********************");
		for (int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
				
		Object ob[] = new Object[3];
		ob[0] = "veda";
		ob[1] = 30;
		ob[2] = "nc";
		System.out.println(ob.length);
		for (int l=0;l<ob.length;l++) {
			System.out.println(ob[l]);
		}
		
		int b[] = {10,20,30,40,50};
		System.out.println(b[0]);
		for(int k=0;k< b.length;k++)
		{
			System.out.println(b[k]);
		}
		System.out.println(Arrays.toString(b));
		
		
		
		
				
	}

}
