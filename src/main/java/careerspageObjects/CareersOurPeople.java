package careerspageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class CareersOurPeople extends AbstractPageStepDefinition{
	public CareersOurPeople(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	

}
