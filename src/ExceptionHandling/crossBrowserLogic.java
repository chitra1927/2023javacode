package ExceptionHandling;

public class crossBrowserLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "chrom";
		
		if(browser.equals("chrome")) {
			System.out.println("chrome browser");
		}
		else if(browser.equals("firefox")){
			System.out.println("firefox browser");
		}
		else if(browser.equals("mozilla")) {
			System.out.println("mozilla browser");
		}
		else {
			System.out.println("browser not found");
			throw new MyException("BROWSERNOTFOUND");
		}
		
	}

}
