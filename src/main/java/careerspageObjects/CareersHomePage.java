package careerspageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class CareersHomePage extends AbstractPageStepDefinition{
	public CareersHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();

	
	@FindBy(how = How.XPATH, xpath ="//span[@class='plyr__progress']/input[@class='plyr__progress--seek']")
	private WebElement CrVideoProgBar;
	
	
	
	public void AssertHeroVideoAutoPlay(){
		Assert.assertTrue(CrVideoProgBar.getAttribute("value") != null);
	}

}
