package intshop.intshop_poc_cuke.conductor.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver Driver){
		driver = Driver;
	}
	
	public String WelcomeMessage() {
		
        String message = driver.findElement(By.xpath("//ng-view/div[1]/div/div/div[1]/div/h1")).getText();
        return message;
	}
	
    public WebElement LoginButton()
    {
        //var button = _driver.FindElement(By.PartialLinkText("Login"));
        WebElement button = driver.findElement(By.xpath("//a[@title='Login']"));
        return button;
    }
}
