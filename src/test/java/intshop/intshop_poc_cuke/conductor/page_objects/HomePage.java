package intshop.intshop_poc_cuke.conductor.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div"), 7));
    	
        WebElement button = driver.findElement(By.xpath("//a[@title='Login']"));
        return button;
    }
    
    public String getPageTitle() {
    	
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div"), 7));
    	
    	return driver.getTitle();
    }
}
