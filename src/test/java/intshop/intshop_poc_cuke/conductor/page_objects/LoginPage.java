package intshop.intshop_poc_cuke.conductor.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import intshop.intshop_poc_cuke.conductor.ApplicationConfiguration;

public class LoginPage {

	private ApplicationConfiguration applicationConfiguration;
	private WebDriver driver;
	
	public LoginPage(){
		
		this.applicationConfiguration = ApplicationConfiguration.getInstance();
		this.driver = applicationConfiguration.getWebDriver();
	}
	
	public String WelcomeMessage() {
		
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div"), 7)); 
        String message = driver.findElement(By.xpath("//h1")).getText();
        return message;
	}
	
    public WebElement LoginButton()
    {
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));
        WebElement button = driver.findElement(By.tagName("button"));
        return button;
    }
    
    public WebElement HeaderLogo() {
    	
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo")));
        WebElement button = driver.findElement(By.id("logo"));
        return button;
    	
    }
    
    public WebElement RecoverPasswordLink() {
    	
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div"), 7)); 
        WebElement button = driver.findElement(By.xpath("//a[@title='Modal Recover Password']"));
        return button;
    }
    
    public String getLoginPageUrl() {
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div"), 3));    	
    	
    	String wholeUrl = driver.getCurrentUrl();
    	return wholeUrl.substring(wholeUrl.length()-5);
    }
    
}
