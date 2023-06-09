package Asssignments;

public class EncapssulaationExample2 {
	
	private String UserName;
	private String password;
	
	
	
	
	public EncapssulaationExample2(String userName, String password) {
		this.UserName = userName;
		this.password = password;
	}
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void login(String un , String pwd) {
		
		
		System.out.println("logged in successfully");
	}
	
	
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
