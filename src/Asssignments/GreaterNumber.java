package Asssignments;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imp
		//short circuit operator : && in the below program there are three conditions a> b 
		// a > c nd a > d if the first condition a>b fails then it wont the remaining condition 
		//if the first condition is true then it checks the remaining condition.
		// in case of & it checks all the given conditions.
		
		
		int a = 25 , b = 78 , c= 87 , d=97;
		if ( a > b && a > c && a > d)
		{
			System.out.println("A is largest number");
			
		}
		else if ( b > c && b > d)
		{
			System.out.println("B is largest number");
		}
		else if (c > d)
		{
			System.out.println("c is largest number");
		}
		else
		{
			System.out.println("d is largest number");
		}

}
	
	
	
}
