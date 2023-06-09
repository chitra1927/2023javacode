package javabasics;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for each is used to iterate  over arrays or collection class (eg ArrayList )
		
		String names[] = new  String[5];
	    names[0] = "chitra";
	    names[1] = "veda";
	    names[2] = "sai";
	    names[3] = "bhavana";
	    names[4] = "amma";
	    
	    for ( String e: names)
	    {
	    	System.out.println(e);
	    }

	}

}
