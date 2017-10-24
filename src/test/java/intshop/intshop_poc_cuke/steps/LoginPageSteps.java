package intshop.intshop_poc_cuke.steps;

import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertNotNull;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageSteps {

		@Given("^I launch the browser and go to the correct URL$")
		public void i_launch_the_browser_and_go_to_the_correct_URL() throws Throwable {
			
			 System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\win\\chromedriver.exe");
			 ChromeOptions chromeOptions = new ChromeOptions();
			 chromeOptions.addArguments("--headless");
			 WebDriver driver = new ChromeDriver(chromeOptions);

			 String baseWebUrl = "http://preprod.intshop.com/";
			 String expectedLoginPageTitle = "IntShop";
			 
			 driver.get(baseWebUrl);
			 String actualLoginPageTitle = driver.getTitle(); 
			 
			 assertEquals(expectedLoginPageTitle, actualLoginPageTitle);
			 driver.close();
		}

		@When("^I click on the Login link on the landing page$")
		public void i_click_on_the_Login_link_on_the_landing_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //
		}

		@Then("^I see all the elements on the page$")
		public void i_see_all_the_elements_on_the_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //
		}
	}
