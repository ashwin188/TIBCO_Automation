package tests;

import org.testng.annotations.Test;
import page.actions.HomePageActions;

public class HomePageTests extends HomePageActions {

	@Test(priority = 1, groups = "Home page")
	public void topNav()  {
		topNavActions();
	}
	
	@Test(priority = 2, groups = "Home page")
	public void header()  {
		headerActions();
	}
	
	@Test(priority = 3, groups = "Home page")
	public void products()  {
		productsActions();
	}
	
	
	@Test(priority = 4, groups = "Home page")
	public void services() throws InterruptedException{
		servicesActions();
	}
	
	@Test(priority = 5, groups = "Home page")
	public void cookieLaw() throws InterruptedException{
		cookieLawActions();
	}
	
	@Test(priority = 6, groups = "Home page")
	public void upperFooter(){
		upperFooterActions();
	}
	
	@Test(priority = 7, groups = "Home page")
	public void lowerFooter(){
		lowerFooterActions();
	}
	
	@Test(priority = 8, groups = "Home page")
	public void locale(){
		localeDropdown();
	}
	
	@Test(priority = 9, groups = "Home page")
	public void homeSeo(){
		pageSourceSEO();
	}
	
}
