package intshop.intshop_poc_cuke.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import intshop.intshop_poc_cuke.conductor.AbstractStepDefinitions;
import intshop.intshop_poc_cuke.conductor.page_objects.LoginPage;

import org.junit.Assert;

public class LoginPageSteps {

	private LoginPage loginpage;
	
	public LoginPageSteps() {
		this.loginpage = new LoginPage();
	}

	@Then("^I see the Welcome message on the IntShop login page$")
	public void i_see_the_Welcome_message_on_the_IntShop_login_page() throws Throwable {
		Thread.sleep(1000);
	    Assert.assertEquals("Welcome to Intshop", loginpage.WelcomeMessage());
	}
	
	@After
	
    protected void teardown() {
		loginpage.teardown();
    }
}
