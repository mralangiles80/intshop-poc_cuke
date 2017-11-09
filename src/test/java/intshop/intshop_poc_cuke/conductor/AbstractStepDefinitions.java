package intshop.intshop_poc_cuke.conductor;

import org.openqa.selenium.WebDriver;

import intshop.intshop_poc_cuke.conductor.page_objects.HomePage;

public class AbstractStepDefinitions {
	
    private ApplicationConfiguration applicationConfiguration;
    private WebDriver driver;

    public WebDriver launchApp() {
      this.applicationConfiguration = ApplicationConfiguration.getInstance();  // gives us access to the single instance of the ApplicationConfiguration class.
      driver = applicationConfiguration.getWebDriver();
      return this.driver;
    }
    
    /**
     * Closes the browser after the test is executed.
     *
     * Note that Cucumber will not allow the @After annotation to be placed in a super class so each inheritor needs to
     * implement a marker method that has the annotation applied to it but then simply calls  this method.
     */
    protected void teardown() {
      if (this.driver != null) {
        this.driver.quit();
        this.driver = null;
      }
    }
} 
