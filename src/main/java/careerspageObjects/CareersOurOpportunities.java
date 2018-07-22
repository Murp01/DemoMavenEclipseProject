package careerspageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class CareersOurOpportunities extends AbstractPageStepDefinition{
	public CareersOurOpportunities(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='breadcrumb']/ul/li[contains(text(),'Our opportunities')]")
	private WebElement OurOpportunitiesBreadCrumb;
	
	
	public void AssertBreadCrumbOurOpportunities(){
		Assert.assertTrue(OurOpportunitiesBreadCrumb.isDisplayed());
	}

}
