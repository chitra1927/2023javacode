package oop_abstract;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loginPage lp = new loginPage(10);
		lp.title();
		lp.url();
		lp.calculatePageLoadTimeOut();
		lp.displayLogo();
		lp.numberOfImages();
		loginPage.displayFooter();
		page.displayFooter();
		
		
		// we cannot create an object of page class so using top casting.
		
		page p = new loginPage();
		p.title();
		p.url();
		p.calculatePageLoadTimeOut();
		p.displayLogo();
		

	}

}
