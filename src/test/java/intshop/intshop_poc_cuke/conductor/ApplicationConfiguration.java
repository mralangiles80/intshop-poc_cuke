package intshop.intshop_poc_cuke.conductor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class ApplicationConfiguration {

	private static ApplicationConfiguration instance;
	
	public static ApplicationConfiguration getInstance() {
		if(instance == null) {
		instance = new ApplicationConfiguration();
		}
		return instance;
	}
	
    private String browser;

    // Private constructor - you can't create a new ApplicationConfiguration - you must call ApplicationConfiguration.Instance();

	private ApplicationConfiguration() {

        // Read the properties from the system properties - they are set from the pom.xml file  -- see below

        // We use profiles in the POM file for different configs
		
        Properties props = System.getProperties();
        
        System.getProperties().list(System.out);
        
        getDesiredBrowser(props);

    }


    private void getDesiredBrowser(Properties props) {

      String retrievedBrowser = props.getProperty("config.browser");
      System.out.println(retrievedBrowser);

      if (retrievedBrowser == null || retrievedBrowser.length() == 0) {

        // browser property was not retrieved - revert to a sensible default

        retrievedBrowser = "chrome";

      }

      this.browser = retrievedBrowser;

      // get os from pom
      
      String retrievedOs = props.getProperty("config.os");
      
      System.out.println(retrievedOs);

      configureSystemPropertiesForWebDriver(retrievedOs);
    }


    /**
     * Sets the system properties required by the WebDriver depending on the operating system and the browser being
     * used.
     *
     * Note that we only support the browsers Chrome and PhantomJs. We only support Mac OSX and Linux operating systems
     * at the moment.
     */
    private void configureSystemPropertiesForWebDriver(String driverOs) {
        String chromePath;
    	System.out.println(driverOs);
        if (driverOs == "windows") {
            //chromePath = String.format("src\\test\\resources\\win\\chromedriver.exe");
        	chromePath = "src\\test\\resources\\win\\chromedriver.exe";
        	System.out.println("if statement true");

        } else {
            chromePath = "src/test/resources/macosx/chromedriver";
        	System.out.println("if statement false");
        }
        //chromePath = "src\\test\\resources\\win\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

    }

    public WebDriver getWebDriver() {

      // We could've/should've used the WebDriverFactory here!

      ChromeOptions options = new ChromeOptions();
      
      if (this.browser.equals("chrome-headless")) {
    	  options.addArguments("--headless");
      }

      return new ChromeDriver(options);
    }

}