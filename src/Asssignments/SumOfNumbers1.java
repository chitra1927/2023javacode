package Asssignments;
import java.util.Scanner;

public class SumOfNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, sum = 0, z, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of numbers");
		n=sc.nextInt();
		for (i=0; i<n ; i++)
		{
			System.out.println("enter the number");	
			z = sc.nextInt();
			sum = sum + z ;
			
		}
		System.out.println("sum is" +sum);
		

	}

}
