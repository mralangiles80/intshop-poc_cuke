package intshop.intshop_poc_cuke.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import intshop.intshop_poc_cuke.conductor.AbstractStepDefinitions;
import intshop.intshop_poc_cuke.conductor.page_objects.LoginPage;

import org.junit.Assert;

public class LoginPageSteps extends AbstractStepDefinitions{

	private LoginPage loginpage;
	
	public LoginPageSteps() {
		this.loginpage = new LoginPage();
	}

	@Then("^I see the Welcome message on the IntShop login page$")
	public void i_see_the_Welcome_message_on_the_IntShop_login_page() throws Throwable {
		Thread.sleep(1000);
		Assert.assertEquals("login", loginpage.getLoginPageUrl());
	    Assert.assertEquals("Welcome to Intshop", loginpage.WelcomeMessage());
	}
	
	@Then("^I see the Login button on the IntShop login page$")
	public void i_see_the_Login_button_on_the_IntShop_login_page() throws Throwable
	{
	    loginpage.LoginButton();
	}

	@Then("^I see the Intshop header logo on the IntShop login page$")
	public void i_see_the_Intshop_header_logo_on_the_IntShop_login_page() throws Throwable 
	{
		loginpage.HeaderLogo();
	}

	@Then("^I see the Forgot Password link on the IntShop login page$")
	public void i_see_the_Forgot_Password_link_on_the_IntShip_login_page() throws Throwable
	{
		loginpage.RecoverPasswordLink();
	}
	
    @After

    @Override

    public void teardown() {

      super.teardown();

    }
}
