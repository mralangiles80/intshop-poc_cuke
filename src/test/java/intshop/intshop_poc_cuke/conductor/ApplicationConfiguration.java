package intshop.intshop_poc_cuke.conductor;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class ApplicationConfiguration {

    private static ApplicationConfiguration instance;
    private String browser;

    public static ApplicationConfiguration Instance() {
        return instance;
    }

    // Private constructor - you can't create a new ApplicationConfiguration - you must call ApplicationConfiguration.Instance();

	private ApplicationConfiguration() {

        // Read the properties from the system properties - they are set from the pom.xml file  -- see below

        // We use profiles in the POM file for different configs

        Properties props = System.getProperties();

        getDesiredBrowser(props);

        // We also stored things like the url to the application in the POM file

        // and the target operating system (although that can be detected)

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
  
      configureSystemPropertiesForWebDriver(retrievedOs);
    }


    /**
     * Sets the system properties required by the WebDriver depending on the operating system and the browser being
     * used.
     *
     * Note that we only support the browsers Chrome and PhantomJs. We only support Mac OSX and Linux operating systems
     * at the moment.
     */
    private void configureSystemPropertiesForWebDriver(String os) {
        String chromePath;
        if (os == "Windows") {
            chromePath = String.format("src\\test\\resources\\win\\chromedriver.exe");

        } else {
            chromePath = String.format("src/test/resources/macosx/chromedriver");
        }
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.setProperty("webdriver.chrome.silentOutput", "true");

    }

    public WebDriver getWebDriver() {

      // We could've/should've used the WebDriverFactory here!

      ChromeOptions options = new ChromeOptions();
      options.addArguments("--headless");
    	
      /*
      if (this.browser.equals("chrome")) {
    	  
        return new ChromeDriver(options);

      }
      */


      return new ChromeDriver(options);
      
    }

}