package intshop.intshop_poc_cuke.conductor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverHelper {

	private static WebDriver driver;
	public WebdriverHelper () {
		
		ApplicationConfiguration applicationConfiguration = ApplicationConfiguration.getInstance();
		this.driver = applicationConfiguration.getWebDriver();
	}
	
	public static void ClickElement(By by) {
		
		int timeoutInSeconds = 1000; 
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).click();
	}
}
