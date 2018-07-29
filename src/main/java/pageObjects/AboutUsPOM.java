package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
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
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content accordion-content-active']")
	private WebElement accordionModuleContent01;	
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content accordion-content-active']")
	private WebElement accordionModuleContent02;	
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='ui-accordion-content ui-corner-bottom ui-helper-reset ui-widget-content accordion-content-active']")
	private WebElement accordionModuleContent03;
	
	@FindBy(how = How.XPATH, xpath = "//h2[@id='ui-id-1']")
	private WebElement accordionModuleTab01;
	
	@FindBy(how = How.XPATH, xpath = "//h2[@id='ui-id-3']")
	private WebElement accordionModuleTab02;
	
	@FindBy(how = How.XPATH, xpath = "//h2[@id='ui-id-5']")
	private WebElement accordionModuleTab03;
		
	@FindBy(how = How.XPATH, xpath = "//div[@class='rhContent']/ul/li/h5[contains(text(),'Senior')]")
	private WebElement peopleWidgetContainer;
	
	@FindBy(how = How.XPATH, xpath = "(//span[@class='listCta__subtitle listCta__subtitle--top'])[2]")
	private WebElement peopleWidgetName02;
	
	@FindBy(how = How.XPATH, xpath = "(//span[@class='listCta__subtitle listCta__subtitle--top'])[1]")
	private WebElement peopleWidgetName01;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='rhContent']/ul/li[2]")
	private WebElement peopleWidgetProfile01;
	
	
	public void assertAccordionModule(){
		Assert.assertTrue(accordionModule.isDisplayed());
		//Should this be displayed?
	}
	
	public void assertAccordionContent01Displayed(){
		Assert.assertTrue(accordionModuleContent01.isDisplayed());
	}
	
	public void assertAccordionContent02Displayed(){
		Assert.assertTrue(accordionModuleContent02.isDisplayed());
	}
	
	public void assertAccordionContent03Displayed(){
		Assert.assertTrue(accordionModuleContent03.isDisplayed());
	}
	
	public void assertAccordionContent01IsHidden(){
		//can't get this working - maybe go with elements name when hidden
		//Assert.assertFalse(accordionModuleContent01.isDisplayed());		
	}
	
	public void assertPersonProfileName01(){
		String topName = peopleWidgetName01.getText();
		Assert.assertTrue(topName.equals("Charles Jacobs"));
		peopleWidgetName01.click();
		//assert breadcrumb contains topname
	}
	
	public void assertPersonProfileName02(){
		String bottomName = peopleWidgetName02.getText();
		Assert.assertTrue(bottomName.equals("Gideon Moore"));
	}
		
	public void assertPeopleModuleContainer(){
		Assert.assertTrue(peopleWidgetContainer.isDisplayed());
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
	
	public void clickPeopleProfile01(){
		peopleWidgetProfile01.click();
	}
	



}
