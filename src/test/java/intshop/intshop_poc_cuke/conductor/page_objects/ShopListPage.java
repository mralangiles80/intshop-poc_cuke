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
	
	public String Blakdf() { 	
		driver.findElement(By.xpath("//div[ng-repeat='item in items'] and (contains(text(), 'bla'))"));
		return null;
		
	}
	
	public List<String> Shops(){
		List<String> shopList = new ArrayList();
		
		return shopList;
		
	}
	
	public String GetShopRow(int RowNumber){
		
		for (int i = 0; i < 10; i++)

		{

		try

		{
		
		return "blah";
		//return driver.findElement(By.tagName("ng-repeat")).getText().toString();
				
		//.//FindElement(By.TagName("tbody"))

		//.FindElements(By.TagName("tr"))[rowNumber].FindElements(

		//By.TagName("td"))[columnNumber].Text;

		}

		catch (StaleElementReferenceException sere)

		{

		}

		}
		return null;
		
	};
}
