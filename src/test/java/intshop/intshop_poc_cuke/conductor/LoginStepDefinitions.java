package intshop.intshop_poc_cuke.conductor;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class LoginStepDefinitions extends AbstractStepDefinitions {

    private LoginPage loginPage;


    @Given("^I have navigated to the login page$")

    public void iHaveNavigatedToTheLoginPage() {

      this.loginPage = launchApp();  // launchApp is defined in the AbstractStepDefinitions class and will get us the correct web driver.

    }


    @After

    @Override

    public void teardown() {

      super.teardown();

    }

}