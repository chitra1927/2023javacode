package javabasics;

public class LoginPage {

	
	
	
	public boolean login(String userName ,String password)
	{
		System.out.println(userName);
		System.out.println(password);
		if (userName.equalsIgnoreCase("chitra") && password.equalsIgnoreCase("chi1234"))
		{
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
}


   