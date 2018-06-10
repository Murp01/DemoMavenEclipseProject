package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E2E_Test {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("http://www.store.demoqa.com");
		
		driver.navigate().to("http://shop.demoqa.com/?s=" + "dress" + "&post_type=product");

	}

}
