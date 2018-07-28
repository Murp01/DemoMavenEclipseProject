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
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/div/p")
	private WebElement OurOpportAccord01Paragraph;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[1]")
	private WebElement OurOpportAccordion01;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='accordionGeneral ui-accordion ui-widget ui-helper-reset']/h2[2]")
	private WebElement OurOpportAccordion02;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='breadcrumb']/ul/li[contains(text(),'Our opportunities')]")
	private WebElement OurOpportBreadCrumb;
	
	
		
	public void assertBreadCrumbOurOpportunities(){
		Assert.assertTrue(OurOpportBreadCrumb.isDisplayed());
	}
	
	public void assertAccordion01Paragraph(){
		String actualString = OurOpportAccord01Paragraph.getText();
		System.out.println(actualString);
		Assert.assertFalse(actualString.isEmpty());
	}
	
	public void clickAccordion01(){
		OurOpportAccordion01.click();
	}
	
	public void clickAccordion02(){
		OurOpportAccordion02.click();
	}

}
