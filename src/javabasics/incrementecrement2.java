package javabasics;

public class incrementecrement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=19, j=29, k;

	    k = i-- - i++ + --j - ++j + --i - j-- + ++i -j++;
	    System.out.println(i);
	    System.out.println(j);
	    System.out.println(k);
	    
	    //can we appy increment nd decrement on variable at same time
	    
	    int m = 0, n=0;
	    int p= --m * --n * n-- * m--;
	    System.out.println(p);
	    System.out.println(m);
	    System.out.println(n);
	    System.out.println("******************");
	    int h = 1;
	    h= h++ + ++h*--h - h--;
	    System.out.println(h);
	    
	    int ch = 'A';
	    System.out.println((byte)'A');
	    System.out.println(ch++);
	    System.out.println(ch);
	    
	    int ch1 = 'B';
	    System.out.println((byte)'B');
	    System.out.println(--ch1);
	    System.out.println(ch1);
	    
	    int ch2 = 'C';
	    System.out.println((byte)'C');
	    System.out.println(++ch2);
	    
	    double d = 1.5, D = 2.5;
	    System.out.println(d++ + ++D);
	    
	    
	    		
	   
	   
	   
	   
			   
	}

}
