package intshop.intshop_poc_cuke.steps;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import intshop.intshop_poc_cuke.conductor.AbstractStepDefinitions;
import intshop.intshop_poc_cuke.conductor.WebdriverHelper;
import intshop.intshop_poc_cuke.conductor.page_objects.ShopListPage;

public class ShopListPageSteps extends AbstractStepDefinitions {

	private ShopListPage shopListPage;
	
	public ShopListPageSteps() {
		this.shopListPage = new ShopListPage();
	}
	
	@Then("^I see the \"(.*?)\" shop$")
	public void i_see_the_shop(String shopname) throws Throwable {
		
		assertEquals(shopname, shopListPage.GetShopRowName(1));
		
		//shopListPage.ChangeLocationButton().click();
		//WebdriverHelper.ClickLink("Change Location");
	}
	
    @After

    @Override

    public void teardown() {

      super.teardown();

    }
}