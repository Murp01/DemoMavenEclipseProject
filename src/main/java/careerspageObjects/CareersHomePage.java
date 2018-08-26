package careerspageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.AbstractPageStepDefinition;

public class CareersHomePage extends AbstractPageStepDefinition{
	public CareersHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();

	
	@FindBy(how = How.XPATH, xpath ="https://careers.linklaters.com/")
	private WebElement UrlHomePage;
	
	@FindBy(how = How.XPATH, xpath ="//span[@class='plyr__progress']/input[@class='plyr__progress--seek']")
	private WebElement CrVideoProgBar;
	
	
	public void assertCareersHomeUrlAddress(){
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/"));
	}
	
	
	public void assertHeroVideoAutoPlay(){
		Assert.assertTrue(CrVideoProgBar.getAttribute("value") != null);
	}

}
