package intshop.intshop_poc_cuke.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import intshop.intshop_poc_cuke.conductor.AbstractStepDefinitions;
import intshop.intshop_poc_cuke.conductor.page_objects.HomePage;


public class WebDriverCheckStepsDefinitions extends AbstractStepDefinitions {

    private HomePage homePage;


    @Given("^I log in using the abstract steps$")

    public void iHaveNavigatedToTheLoginPage() {

      launchApp();  // launchApp is defined in the AbstractStepDefinitions class and will get us the correct web driver.

    }

    @Then("^I am happy$")
    
    public void IAmHappy() {
    	// happy!
    }

    @After

    @Override

    public void teardown() {

      super.teardown();

    }

}