package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class AboutUsPOM extends AbstractPageStepDefinition{
	public AboutUsPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
	CommonPOM commonPOM;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[1]")
	private WebElement accordionModule;
	
	@FindBy(how = How.XPATH, xpath = "//h2[@id='ui-id-1']")
	private WebElement accordionModuleTab01;
	
	@FindBy(how = How.XPATH, xpath = "//h2[@id='ui-id-3']")
	private WebElement accordionModuleTab02;
	
	@FindBy(how = How.XPATH, xpath = "//h2[@id='ui-id-5']")
	private WebElement accordionModuleTab03;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content accordion-content-active']")
	private WebElement accordionModuleContent01;	
	
	public void assertAccordionModule(){
		Assert.assertTrue(accordionModule.isDisplayed());
		//Should this be displayed?
	}
	
	public void assertAccordionContent01Displayed(){
		Assert.assertTrue(accordionModuleContent01.isDisplayed());
	}
	
	public void assertAccordionContent01IsHidden(){
		//can't get this working
		Assert.assertFalse(accordionModuleContent01.isDisplayed());		
	}
	
	public void clickAccordionTab01(){
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", accordionModuleTab01);
	}
	
	public void clickAccordionTab02(){
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", accordionModuleTab02);
	}

	public void clickAccordionTab03(){
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", accordionModuleTab03);
	}


}
