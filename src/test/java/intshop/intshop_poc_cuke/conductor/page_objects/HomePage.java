package intshop.intshop_poc_cuke.conductor.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver Driver){
		driver = Driver;
		driver.get("http://preprod.intshop.com");
	}
	
    public WebElement LoginButton()
    {
        //var button = _driver.FindElement(By.PartialLinkText("Login"));
        WebElement button = driver.findElement(By.xpath("//a[@title='Login']"));
        return button;
    }
}
