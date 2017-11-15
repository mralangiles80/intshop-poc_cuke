package intshop.intshop_poc_cuke.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import intshop.intshop_poc_cuke.conductor.AbstractStepDefinitions;
import intshop.intshop_poc_cuke.conductor.page_objects.HomePage;

public class HomePageSteps extends AbstractStepDefinitions {

	private HomePage homepage;
	
	public HomePageSteps() {
		this.homepage = new HomePage();
	}
	
	@Given("^I launch my browser and navigate to the IntShop homepage$")
	public void i_launch_my_browser_and_navigate_to_the_IntShop_homepage() throws Throwable {
		
		this.launchApp();
		 homepage.goToUrl("http://preprod.intshop.com");
		
		 String expectedHomePageTitle = "IntShop";
		 
		 String actualHomePageTitle = homepage.getPageTitle(); 
		 
		 assertEquals(expectedHomePageTitle, actualHomePageTitle);

	}
	
	@When("^I click on the Login button on the IntShop homepage$")
	public void i_click_on_the_Login_button_on_the_IntShop_homepage() throws Throwable {
		//Thread.sleep(1000);
		
		homepage.LoginButton().click();
	}
	
	@When("^I enter the \"(.*?)\" text in the Type your post code field$")
	public void i_enter_the_text_in_the_Type_your_post_code_field(String postcode) throws Throwable
	{
		homepage.EnterPostcode(postcode);
	}
	
	@When("^I click on the Find Near Groceries button$")
	public void i_click_on_the_Find_Near_Groceries_button() throws Throwable
	{
		homepage.FindNearbyGroceriesButton().click();
	}
	
    @After

    @Override

    public void teardown() {

      super.teardown();

    }
	
}
