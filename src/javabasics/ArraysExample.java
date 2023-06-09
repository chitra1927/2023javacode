package javabasics;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browsers[] = {"Chrome", "firefox" , "safari" ,"ie" , "edge"};
		
		for (int i =0; i<browsers.length; i++)
		{
			System.out.println(browsers[i]);
			switch(browsers[i].toLowerCase().trim()) {
			case "chrome" :
				System.out.println("chrome is coming from google");
				break;
				
			case "firefox" :
				System.out.println("firefox is coming from mozilla");
				break;
				
			case "safari" :
				System.out.println("safari is coming from apple");
				break;
				
			case "ie"  :
				System.out.println("IE is coming from MICROSOFT");
				break;
				
			case "edge" :
				System.out.println("edge is coming from MICROSOFT");
				break;
				
			}
			
			
		}
		

	}

}
