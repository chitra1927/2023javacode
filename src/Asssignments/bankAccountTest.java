package Asssignments;

public class bankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankAccount b1 = new bankAccount();
		b1.setAccountNumber("EEE234567");
		b1.setBalance(200);
		b1.setOwner("chitra");
		
		
	    
	    double r = b1.deposit(200);
	    System.out.println(r);
	    double f = b1.withDraw(100);
	    System.out.println(f);
	    
	    System.out.println(b1.getAccountNumber());
	    System.out.println(b1.getBalance());
	    System.out.println(b1.getOwner());
	    
	    
	}

}
