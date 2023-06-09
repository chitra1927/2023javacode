package javabasics;

public class MethodsInJava3 {

	
		public Boolean getLauchBrowser(String browserName)
		{
			System.out.println("getting browser name :" +  browserName);
			boolean flag = true;
			switch(browserName.toLowerCase().trim())
			{
			
			case "chrome" :
				System.out.println("Launch the browser");
				break;
			case "ie" :
				System.out.println("Launch the browser");
				break;
			case "edge":
				System.out.println("Launch the browser");
				break;
			default:
				System.out.println("Browser not found , please enter correct browser name");
				flag = false;
				break;
			}
			return flag;	
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			MethodsInJava3 m1 = new MethodsInJava3();
			boolean r = m1.getLauchBrowser("edge");
			System.out.println(r);
			
			boolean g = m1.getLauchBrowser("ie");
			System.out.println(g);
			
			boolean k = m1.getLauchBrowser("firefox");
			System.out.println(k);
			
			
		}


	}
