package br.com.aucelio.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	private static final String DRIVER = "src/test/resources/webdriver/geckodriver.exe";
    public static WebDriver driver;
    
    public static void abrir(String url){
      
      if(driver == null){
        System.setProperty("webdriver.gecko.driver", DRIVER);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
      }
  
      driver.get(url);
      
    }

    public static void driver(String string) {
    }
	
}
