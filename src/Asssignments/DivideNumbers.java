package Asssignments;

import java.util.Scanner;

public class DivideNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50 , b = 3;
		System.out.println((float)a/b);
		
		//SCANNER CLASS ALLOWS THE USER TO ENTER THE INPUT. WE HAVE NEXTINT() TO SCAN THE 
		//INPUT AS INTEGER
		
		int x,y,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		x= sc.nextInt();
		System.out.println("enter y");
		y= sc.nextInt();
		System.out.println((float)x/y);
		

	}

}
