package intshop.intshop_poc_cuke.conductor.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import intshop.intshop_poc_cuke.conductor.ApplicationConfiguration;

public class LoginPage {

	private ApplicationConfiguration applicationConfiguration;
	private WebDriver driver;
	
	public LoginPage(){
		
		this.applicationConfiguration = ApplicationConfiguration.getInstance();
		this.driver = applicationConfiguration.getWebDriver();
	}
	
	public String WelcomeMessage() {
		
        String message = driver.findElement(By.xpath("//h1")).getText();
        return message;
	}
	
    public WebElement LoginButton()
    {
        //var button = _driver.FindElement(By.PartialLinkText("Login"));
        WebElement button = driver.findElement(By.xpath("//a[@title='Login']"));
        return button;
    }
    
    public void teardown() {
        if (this.driver != null) {
          this.driver.quit();
          this.driver = null;
        }
    }
}
