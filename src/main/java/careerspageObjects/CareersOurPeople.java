package careerspageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class CareersOurPeople extends AbstractPageStepDefinition{
	public CareersOurPeople(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='text-container'][1]")
	private WebElement OurPeopPersonName01;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='text-container'][2]")
	private WebElement OurPeopPersonName02;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='text-container'][3]")
	private WebElement OurPeopPersonName03;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='breadcrumb']/ul/li[contains(text(),'Our people')]")
	private WebElement OurPeopBreadCrumb;
	
	
	public void assertBreadCrumbOurPeople(){
		Assert.assertTrue(OurPeopBreadCrumb.isDisplayed());
	}
	
	public void clickPerson01Name(){
		OurPeopPersonName01.click();
	}
	
	public void clickPerson02Name(){
		OurPeopPersonName02.click();
	}
	
public void clickPerson03Name(){
		OurPeopPersonName03.click();
	}
	
	

}
