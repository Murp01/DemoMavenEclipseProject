 package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AbstractPageStepDefinition {
	protected static WebDriver driver;
	
/*	protected WebDriver getDriver(){
		if (driver == null){
			driver = new FirefoxDriver();
		}
		return driver;
	}*/
	
	protected WebDriver getDriver(){
		if (driver == null){
			//System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
/*	protected WebDriver getDriver(){
		if (driver == null){
			System.setProperty("webdriver.ie.driver", "C:\\Webdrivers\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");			
			driver = new InternetExplorerDriver();
		}
		return driver;
	}*/

}
