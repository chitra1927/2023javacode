package javabasics;

public class StringConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 10;
		int b = 20;
		String x ="hello";
		String y = "world";
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+a+b);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		char c1 = 'm';
		char c2 = 'n';
		String s1 = "testing";
		String s2 = "automation";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println((byte)'m');
		System.out.println((byte)'n');
		System.out.println(c1+c2);
		System.out.println(s1+s2+c1+c2);
		System.out.println(s1+s2+(c1+c2));
		System.out.println("********************");
		System.out.println('m'+'n');
		System.out.println("m+n");
		int i1 = 1000;
		int i2 = 2000;		
		System.out.println("sum of i1 and i2 is" + (i1+i2));
		String z1 = "hello selenium";
		char z2 = 't';
		System.out.println(z1+z2);
		//concate
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		//string builder
		
		StringBuilder h1 = new StringBuilder("chitraa");
		h1.append('h');
		System.out.println(h1);
		
		int f1 = 100;
		int f2 = 200;
		int f3 = 3400;
		int f4 = f1+f2+f3;
		System.out.println("Your tot amount is." + f4);
		
		char g1 = 'h';
		System.out.println((byte)g1);
		
		int o= 3;
		int result = (byte)'d';
		System.out.println(result);
		int sum = o+result;
		System.out.println(sum);
		
		//math.pow() to find the power of a number pow() returns double value
		
		int i = 2;
		int square = (int)Math.pow (i,2);
		System.out.println(square);
		
		// to convert a character to byte.
		
		char p1 = 'c';
		
		System.out.println((byte)p1);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}
