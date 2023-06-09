package javabasics;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i =11;
		i = i++ + ++i;
		System.out.println(i);
		
		int a = 11 , b = 22 , c;
		c = a + b + (a++) + (b++) + (++a) + (++b);
		System.out.println(c);
		
		int l =1 , m = 2 , n = 3;
		int z = l-- - m-- - n--;
		System.out.println(z);
		
		int p =1 , q=2 ;
		int r = --q - ++p + ++q - --p;
		System.out.println(r);
		
				
		
	}

}
