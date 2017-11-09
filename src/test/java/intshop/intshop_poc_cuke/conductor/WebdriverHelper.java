package intshop.intshop_poc_cuke.conductor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverHelper {

	private WebDriver driver;
	public WebdriverHelper (WebDriver driver) {
	}
	
	public void waitForElement(By by) {
		
		int timeoutInSeconds = 1000; 
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
