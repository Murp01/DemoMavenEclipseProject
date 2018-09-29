package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class SD_Hooks extends AbstractPageStepDefinition{
;
	
	   @Before 
	   public void setUp(){ 
		   WebDriver driver = getDriver();	
		   driver.get("https://www.linklaters.com/");
	   } 
	   	   
	   @After 
	   public void cleanUp(){ 
		   driver.close(); 
	   } 
}
