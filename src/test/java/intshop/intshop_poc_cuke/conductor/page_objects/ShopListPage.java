package intshop.intshop_poc_cuke.conductor.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import intshop.intshop_poc_cuke.conductor.ApplicationConfiguration;

public class ShopListPage {

	private ApplicationConfiguration applicationConfiguration;
	private WebDriver driver;
	
	public ShopListPage () {
		
		this.applicationConfiguration = ApplicationConfiguration.getInstance();
		this.driver = applicationConfiguration.getWebDriver();
	}
	
	public String ShopTitle(){
		
		return "";
	};
}
