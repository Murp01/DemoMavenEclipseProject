package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageStepDefinition;

public class FindLawyerPOM extends AbstractPageStepDefinition{
	
	public FindLawyerPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
	Actions action = new Actions(driver);
	
	@FindBy(how = How.XPATH, xpath = "//input[@placeholder='Name']")
	private WebElement InputField_Name;
	
	@FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Business Team Directory')]")
	private WebElement Selector_BusinessTeams;
	
	@FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Lawyer Directory')]")
	private WebElement Selector_LawyerDirectory;
	
	
	
	public void clickSelBusinessTeam(){
		Selector_BusinessTeams.click();
	}
	
	public void clickSelLawyerDir(){
		Selector_LawyerDirectory.click();
	}
	
	public void TypeInInputName(String name){	
		InputField_Name.click();
		InputField_Name.clear();
		InputField_Name.sendKeys(name);
	}
	
	public void clickInputName(){

	}
	

}
