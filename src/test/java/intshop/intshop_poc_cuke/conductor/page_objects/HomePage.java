package intshop.intshop_poc_cuke.conductor.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import intshop.intshop_poc_cuke.conductor.ApplicationConfiguration;

public class HomePage {
	
	private ApplicationConfiguration applicationConfiguration;
	private WebDriver driver;
	
	public HomePage(){
		
		this.applicationConfiguration = ApplicationConfiguration.getInstance();
		this.driver = applicationConfiguration.getWebDriver();
		//driver.get("http://preprod.intshop.com");
	}
	
	public void goToUrl(String url) {
		
		driver.get(url);
	}
	
    public WebElement LoginButton()
    {
        //var button = _driver.FindElement(By.PartialLinkText("Login"));
        WebElement button = driver.findElement(By.xpath("//a[@title='Login']"));
        return button;
    }
    
    public String getPageTitle() {
    	
    	return driver.getTitle();
    }

    public void teardown() {
        if (this.driver != null) {
          this.driver.quit();
          this.driver = null;
        }
      }
}
