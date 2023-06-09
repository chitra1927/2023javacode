package javabasics;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        for ( int j =1 ; j<=5 ; j++)
        {
        	System.out.println("I am batman");
        }
        
        for ( int l = 1 ; l<=9 ; l++)
        {
        	System.out.println("i am batman" + " " + l);
        	
        }
        
        // 10 to 1 using for while and do while
        // 
        for (int k =10 ;k>=1 ; k--)
        {
        	System.out.println(k);
        	
        } 
        System.out.println("**********");
        int m=10;
        while(m>=1)
        {
        	System.out.println(m);
        	m--;
        }
        System.out.println("**********");
        int n = 10;
        do {
        	System.out.println(n);
        	n--;
        }while(n>=1);
        
        //print hello world ten times using while loop
        int o = 1;
        while(o<=10)
        {
        	System.out.println("hello world");
        	o++;
        }
        
        // multiplication of 5 from 1 to 100
        System.out.println("5 mutiples");
        for (int p=1;p<=100;p++)
        {
        	System.out.println(5*p);
        	
        }
        
        //odd nd even numbers from 1 to 10
        
        System.out.println("odd and even numbers");
        for (int q=1;q<=100;q++)
        {
        	if(q%2 == 0)
        	{
        		System.out.println("even number" + " " + q);
        	}
        	else
        	{
        		System.out.println("odd number" + " " + q);
        	}
        	
        }
        
        for(char ch ='A';ch<='Z';ch++)
        {
        	System.out.println(ch + "=" + (byte)ch);
        	
        }
        
        for(int r=0; r<=9 ; r++)
        {
        	System.out.println(r + "=" + (byte)r);
        }
        
        //vowel or consonant
        
        for (char c='a';c<='z';c++)
        {
        	if (c == 'a' || c == 'e' || c == 'i' || c=='o' || c=='u')
        	{
        		System.out.println(c + "is vowel");

        	}
        	
        	else
        	{
        		System.out.println(c + "is consonant");
        	}
        }
        
        
        for ( int i=0 ; i<=99; i=i+9)
        {
        	int j = i*1;
            System.out.println(j);
        			
        			
        }
        
        for(float f = 1.0f ; f <= 10.0 ; f++)
        {
        	System.out.println(f);
        }
        
        
        
        

	}

}
