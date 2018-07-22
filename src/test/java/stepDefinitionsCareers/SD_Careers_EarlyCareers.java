package stepDefinitionsCareers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_EarlyCareers extends AbstractPageStepDefinition {
	public SD_Careers_EarlyCareers(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
	
	public void assertTitle01(){
		WebDriverWait  wait01 =new WebDriverWait(driver,5);
		wait01.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/en/early-careers"));
	}

}
