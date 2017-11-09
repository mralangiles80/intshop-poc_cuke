package intshop.intshop_poc_cuke.conductor;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class ApplicationConfiguration {

	private static ApplicationConfiguration instance;
	private WebDriver driver;
	
	public static ApplicationConfiguration getInstance() {
		if(instance == null) {
		instance = new ApplicationConfiguration(); 
		}
		return instance;
	}
	
    private String browser;
	private String os;


    // Private constructor - you can't create a new ApplicationConfiguration - you must call ApplicationConfiguration.Instance();

	private ApplicationConfiguration() {

        // Read the properties from the system properties - they are set from the pom.xml file  -- see below

        // We use profiles in the POM file for different configs
		
        Properties props = System.getProperties();
        
        getDesiredBrowser(props);
        setWebDriver();
    }
	
	private void setWebDriver() {
		
        ChromeOptions options = new ChromeOptions();
        
        if (this.browser.equalsIgnoreCase("chrome-headless")) {
      	  options.addArguments("--headless");
        }
        
        this.driver = new ChromeDriver(options);
		
	}

    public WebDriver getWebDriver() {
    	
    	return this.driver;
      }

    private void getDesiredBrowser(Properties props) {

      String retrievedBrowser = props.getProperty("config.browser");

      if (retrievedBrowser == null || retrievedBrowser.length() == 0) {

        // browser property was not retrieved - revert to a sensible default

        retrievedBrowser = "chrome";

      }

      this.browser = retrievedBrowser;

      // get os from pom
      
      String retrievedOs = props.getProperty("config.os");

      if (retrievedOs == null || retrievedOs.length() == 0) {

          // browser property was not retrieved - revert to a sensible default

    	  retrievedOs = "linux";

        }
      
      this.os = retrievedOs;

      // set properties according to profile os and browser
      
      configureSystemPropertiesForWebDriver();
    }


    /**
     * Sets the system properties required by the WebDriver depending on the operating system and the browser being
     * used.
     *

     */
    private void configureSystemPropertiesForWebDriver() {
    	
        String driverPath;
    	if (this.os.equalsIgnoreCase("windows")) {
    		
    		driverPath = "src\\test\\resources\\win\\chromedriver.exe";

        } 	
    	else if (this.os.equalsIgnoreCase("macosx")) {
        	driverPath = "src/test/resources/macosx/chromedriver";
        }
    	
        else if (this.os.equalsIgnoreCase("linux")) {
        		driverPath = "/usr/lib/chromium-browser/chromedriver";
        }
    	
        else {
        		// default to windows
        		driverPath = "src\\test\\resources\\win\\chromedriver.exe";
            	System.out.println("no os passed through");
        }
        String driverPathProperty = "webdriver.chrome.driver";
    
        System.setProperty(driverPathProperty, driverPath);
    }

}