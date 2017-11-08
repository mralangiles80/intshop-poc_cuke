package intshop.intshop_poc_cuke.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import intshop.intshop_poc_cuke.conductor.AbstractStepDefinitions;
import intshop.intshop_poc_cuke.conductor.page_objects.LoginPage;

import org.junit.Assert;

public class LoginPageSteps extends AbstractStepDefinitions {

	private LoginPage loginpage;
	
	/*public LoginPageSteps(WebDriver Driver) {
		loginpage = new LoginPage(Driver);
	}*/

	@Then("^I see the Welcome message on the IntShop login page$")
	public void i_see_the_Welcome_message_on_the_IntShop_login_page() throws Throwable {
		
	    Assert.assertEquals("Welcome to IntShop", loginpage.WelcomeMessage());
	}
	
    @After

    @Override

    public void teardown() {

      super.teardown();

    }
}
