package Asssignments;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		switch(browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("selected browser is chrome");
		    break;
		case "firefox" :
			System.out.println("selected browser is firefox");
		    break;
		case "safari" :
			System.out.println("selected browser is safari");
		    break;
		default :
			System.out.println("selected browser is not avaible");
			break;
	}

}
}
