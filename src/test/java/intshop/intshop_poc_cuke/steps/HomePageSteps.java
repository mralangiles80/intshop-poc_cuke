package intshop.intshop_poc_cuke.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import intshop.intshop_poc_cuke.conductor.AbstractStepDefinitions;
import intshop.intshop_poc_cuke.conductor.page_objects.HomePage;

public class HomePageSteps {

	private HomePage homepage;
	
	public HomePageSteps() {
		this.homepage = new HomePage();
	}
	
	@Given("^I launch my browser and navigate to the IntShop homepage$")
	public void i_launch_my_browser_and_navigate_to_the_IntShop_homepage() throws Throwable {
		
		homepage.goToUrl("http://preprod.intshop.com");
		
		 String expectedLoginPageTitle = "IntShop";
		 
		 String actualLoginPageTitle = homepage.getPageTitle(); 
		 
		 assertEquals(expectedLoginPageTitle, actualLoginPageTitle);
	   //this.homepage = launchApp();
	}
	
	@When("^I click on the Login button on the IntShop homepage$")
	public void i_click_on_the_Login_button_on_the_IntShop_homepage() throws Throwable {
		Thread.sleep(1000);
		homepage.LoginButton().click();
	}
	
	@After
	
    protected void teardown() {
		homepage.teardown();
    }
	
}
