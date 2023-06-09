package Asssignments;

public class LoanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String loantype = "housing";
		int salary = 35000;
		switch(loantype.toLowerCase().trim()) {
		case "car" :
		    break;
		case "housing" :
			if ( salary < 35000) {
				System.out.println("not applicable for housing loan");
			}
			else {
				System.out.println(" applicable for housing loan");
			}	
		    break;
		case "personal" :
		    break;
		case "education" :
		    break; 
		default :
			System.out.println("entered loantype is not avaible");
			break;
	}

}

}