package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class Common extends AbstractPageStepDefinition {
	
	public Common(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='header__navDesktop']/ul/li/a[@href='/en/about-us']")
	private WebElement header_AboutUs;
	
	@FindBy(how = How.XPATH, xpath = "//li/a[@href='/en/about-us/alumni']")
	private WebElement header_AboutUs_Alumni;
	
	@FindBy(how = How.XPATH, xpath ="/html/body/header/div/div/div/ul/li[6]/a")
	private WebElement header_Insights;
	
	@FindBy(how = How.XPATH, xpath = "//input[@class='header__searchInput']")
	private WebElement header_SearchInput;
	
	@FindBy(how = How.XPATH, xpath = "//button[@class='header__searchToggle']")
	private WebElement header_SearchToggle;
	
	
	public void aboutUsTitleHover(){
		Actions builder = new Actions(driver);
		builder.moveToElement(header_AboutUs).build().perform();
	}
	
	public void aboutUsAlumniClick(){

	}
	
	public void insightTitleClick(){
		header_Insights.click();
	}
	
	public void insightTitleHover(){
		Actions builder = new Actions(driver);
		builder.moveToElement(header_Insights).build().perform();
	}
	
	public void searchInputClick(){
		header_SearchInput.click();
	}
	
	public void searchToggleClick(){
		header_SearchToggle.click();
	}
	
	public void searchInputSendKeys(){
		header_SearchInput.sendKeys();
	}
	
	public void searchInputAssertTrue(){
		Assert.assertTrue("The searchbox opened successfully", header_SearchInput.isDisplayed());
	}
	
	public void searchInputAssertFalse(){
		Assert.assertFalse("", header_SearchInput.isDisplayed());
	}
	

}
