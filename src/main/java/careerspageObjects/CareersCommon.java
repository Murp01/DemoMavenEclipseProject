package careerspageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import stepDefinitions.AbstractPageStepDefinition;

public class CareersCommon extends AbstractPageStepDefinition{
	public CareersCommon(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers'][1]")
	private WebElement Title01;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/experienced-lawyers'][1]")
	private WebElement Title02;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/business-teams'][1]")
	private WebElement Title03;
	
	
	public void clickTitle01(){
		Title01.click();
	}
	
	public void clickTitle02(){
		Title02.click();
	}
	
	public void clickTitle03(){
		Title03.click();
	}
	
	public void assertTitle01(){
		
	}
}
