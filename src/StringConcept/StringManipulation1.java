package StringConcept;

import java.util.Arrays;

public class StringManipulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       String s = "hello this is chitra";
       
       
        //to find the index of next SECOND t.
       
         System.out.println(s.indexOf('t',s.indexOf('t')+1));
        
       
		// to find the length of the string.
		
		System.out.println(s.length());
		
		
	    // charAt to find the character at particular index.
		
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.charAt(6));
		
		// indexOf to find the particular index.
		
		//System.out.println(s.charAt(20));(SIOOB)
		
		System.out.println(s.indexOf('h'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('t'));
		
		//to find the index of next t.
		//System.out.println(s.indexOf('t',s.indexOf('t')+1 ));
		
		// to find the index of word starting letter.
		
		System.out.println(s.indexOf("chitra"));
		
		
		System.out.println(s.indexOf("devi"));
		
		
		String msg = "hello user";
		
		//TO FIND WHETHER USER IS IN POSITION 6.
		
		if (msg.indexOf("user") == 6) {
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		// TO TRIM THE EXTRA SPACES.
		
		
		String h = "  hello world    ";
		System.out.println(h.trim());
		
		// TO UPPERCASE
		
		String r = "gang";
		System.out.println(r.toUpperCase());
		
		String k = "POLO";
		System.out.println(k.toLowerCase());
		
		// replace 
		
		String dob = "19-07-1998";
		System.out.println(dob.replace('-','/'));
		
		
		String emp = "chitra|26|capgemini|hyderabad" ;
		System.out.println(emp.replace('|', ','));
		
		
		String s1 = "hello people";
		
		String s2 ="HELLO PEOPLE";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println(" TWO STRINGS ARE EQUAL");
		}
		else {
			System.out.println("TWO STRINGS ARE NOT EQUAL");
		}
		
		String browser = " chrome";
		
		if(browser.trim().equalsIgnoreCase("CHROME"))
		{
		System.out.println("PASS");
		}
		
		//CONTAINS 
		
		String y = "good morning";
		System.out.println(y.contains("morning"));
		
		//split:
		
		String s3 = "java_automation_test_training";
		String l[] = s3.split("_");
		System.out.println(l[0]);
		System.out.println(l[1]);
		System.out.println(Arrays.toString(l));		
		
		String s4 = "xxSeleniumxxjavaxxhtmlxxsqlxxcsharpxxvbscripting";
		String w[] = s4.split("xx");
		System.out.println(w[0]);
		System.out.println(w[0].length());
		System.out.println(Arrays.toString(w));	
		
		
		String empInfo = "chitra|27|capgemini|hyderabad";
		String b[] = empInfo.split("\\|");
		System.out.println(Arrays.toString(b));	
		
		String p = "hi chitra good morning";
		String q ="good morning guys";;
		
		
		//starts with and ends with. returns true or false.
		
		System.out.println(p.startsWith("hi"));
		
		System.out.println(q.endsWith("guys"));
		
		//how to get the substring
		//                                21
		String d = "your transaction id is 12345";
		
		System.out.println(d.substring(d.indexOf("is")+3));
		
		//how to get transaction substring.
		
		System.out.println(d.substring(5,16));
		
		System.out.println(d.substring(d.indexOf("is")+2).trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
