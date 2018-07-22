package careerspageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import careerspageObjects.CareersCommon;

import stepDefinitions.AbstractPageStepDefinition;

public class CareersEarlyCareers extends AbstractPageStepDefinition{
	public CareersEarlyCareers(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
	CareersCommon careersCommon = new CareersCommon(driver);
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='header__navDesktop']/ul/li/a[@href='/en/early-careers']")
	private WebElement Title01;
	
	

	


}
