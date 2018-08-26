package pageObjects;

import java.util.List;

import org.junit.Assert;
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
	
	
	@FindBy(how = How.XPATH, xpath = "//span[@class='ctaLoadMore__text']")
	private WebElement Button_LoadMore;
	
	@FindBy(how = How.XPATH, css = "span[class='listCta__subtitle listCta__subtitle--top ellipsis']")
	private WebElement Container_ProfileSearchResults;
	
	@FindBy(how = How.XPATH, xpath = "//input[@placeholder='Name']")
	private WebElement InputField_Name;
	
	@FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Business Team Directory')]")
	private WebElement Selector_BusinessTeams;
	
	@FindBy(how = How.XPATH, xpath = "//a[contains(text(),'Lawyer Directory')]")
	private WebElement Selector_LawyerDirectory;
	
	@FindBy(how = How.XPATH, xpath = "//p[contains(text(),'Your search did not return')]")
	private WebElement Text_NoSearchResults;
	
	
	public void assertNoReturnResultsText(){
		Assert.assertTrue(Text_NoSearchResults.isDisplayed());
	}	
	
	public void assertAllReturnResultsContain(String profileName) throws Throwable{
		List<WebElement> returnProfile = driver.findElements(By.cssSelector("span[class='listCta__subtitle listCta__subtitle--top ellipsis']"));
		if(returnProfile.size() >0){
			for (int i = 0; i <returnProfile.size(); i++){			
				if(returnProfile.get(i).isDisplayed()==true){	
					System.out.println(returnProfile.get(i).getText());
					Assert.assertTrue(returnProfile.get(i).getText().contains(profileName));	
				}
			}
		}
		else{
			System.out.println("There are no names that match the search term " + profileName + ".");
		}
	}	
	
	public void assertButtonLoadMore(){
		Button_LoadMore.isDisplayed();
	}
	
	public void clickButtonLoadMore(){
		Button_LoadMore.click();
	}
	
	public void clickSelBusinessTeam(){
		Selector_BusinessTeams.click();
	}
	
	public void clickEachLoadMoreOccurance() throws Throwable{
		while(Button_LoadMore.isDisplayed()){
			Button_LoadMore.click();
			Thread.sleep(5000);
		}
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
