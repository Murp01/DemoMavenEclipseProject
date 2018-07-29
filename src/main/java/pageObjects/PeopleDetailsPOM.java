package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class PeopleDetailsPOM extends AbstractPageStepDefinition{
	public void PeopleDetailsPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
