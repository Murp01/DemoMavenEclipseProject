package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class PeopleDetailsPOM extends AbstractPageStepDefinition{
	public PeopleDetailsPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	WebDriver driver = getDriver();
	String cJacobs = "Charles Jacobs";
	
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='breadcrumb']/ul/li[2]")
	private WebElement breadCrumbProfileName; 
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='col-md-9 col-xs-12']/h1")
	private WebElement header01ProfileName;
	
	
	public void getBreadcrumbProfileName(){
		String bcName = breadCrumbProfileName.getText();
	}
	
	public void assertPeopleDetailBreadcrumb(){
		String bcName = breadCrumbProfileName.getText();
		Assert.assertTrue(bcName.contains(cJacobs));
	}
	
	public void assertHeader01ProfileName(){
		String h1ProfileName = header01ProfileName.getText();
		Assert.assertTrue(h1ProfileName.contains(cJacobs));
	}
	
	
	//Grouped method methods
	
	public void assertCorrectPeopleDetailsPageOpens(){
		getBreadcrumbProfileName();	
		assertPeopleDetailBreadcrumb();
		assertHeader01ProfileName();
	}

}
