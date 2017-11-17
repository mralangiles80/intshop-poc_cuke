package intshop.intshop_poc_cuke.conductor.page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import intshop.intshop_poc_cuke.conductor.ApplicationConfiguration;

public class ShopListPage {

	private ApplicationConfiguration applicationConfiguration;
	private WebDriver driver;
	//private ShopRow shopRow;
	
	public ShopListPage () {
		
		this.applicationConfiguration = ApplicationConfiguration.getInstance();
		this.driver = applicationConfiguration.getWebDriver();
	}
	
	public WebElement ChangeLocationButton() {
		
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div"), 7)); 
        WebElement button = driver.findElement(By.xpath("//a[@title='Change Location']"));
        return button;
	}
	
	public List<WebElement> Shops(){
		
    	int timeoutInSeconds = 10;
    	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
    	wait.until(ExpectedConditions.elementToBeClickable(By.className("footer-logo")));

        // this is a fudge till i can work out a better way
    	List<WebElement> shops = driver.findElements(By.xpath("//*[contains(text(),'store')]"));
        return shops;
	}
	
	public String GetShopRowName(int rowNumber){
		
		List<WebElement> shops = Shops();
		
        if (shops.size() > 0) {
        	
        	WebElement shopRow = shops.get(rowNumber-1);
		
        	String shopName =  shopRow.getText();
	    
        	return shopName;
		
        }
		
		else 
			System.out.println("no shops to list");
			return "";
	};
}
