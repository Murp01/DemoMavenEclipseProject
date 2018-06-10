package seleniumTests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class E2E_Test {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://www.linklaters.com/");
		
		//Click on Insights title
		driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[6]/a")).click();
		
		//Enter paul into the search box
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Paul");
		

	}

}
