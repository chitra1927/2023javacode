package javabasics;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String env = "pROD  ";
		switch(env.toLowerCase().trim()) {
		case "qa" :
			System.out.println("in qa region");
		    break;
		case "dev" :
			System.out.println("in dev region");
		    break;
		case "uat" :
			System.out.println("in uat region");
		    break;
		case "prod" :
			System.out.println("in prod region");
		    break; 
		default :
			System.out.println("in default region");
			break;
		}
		
		
	}
}
