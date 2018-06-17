package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InsightsPage {
	
	
/*	Constructor that initalizes the InsightsPage page object.  While the test is running the driver will 
	be passed into the constructor's argument.  this (I think) is the pageobject iself?*/	
	public InsightsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}

/*	The FindBy method is used to create an object of a page element of the webpage.  The page object below
	is named TxtBox_Keyword*/	
	@FindBy(how = How.XPATH, xpath ="/html/body/div[4]/div/div/div[1]/div/div[1]/div[1]/input")
	private WebElement TxtBox_Keyword;

	
/*	Below I have created methods that will use the objects created above.  These can be called from other
	pages by first calling the page object (InsightsPage) followed by '.' and then the methods below wil
	appear in the intellibox*/
	public void insight_KeywordEnterText(String keyword){
		TxtBox_Keyword.sendKeys(keyword);
	}
	
	public void insight_KeywordClearText(){
		TxtBox_Keyword.clear();
	}
	
	public void insight_KeywordClick(){
		TxtBox_Keyword.click();
	}
	
	
/*	Method created using the POM methods above.  Multiple methods can be added to a method to create some 
	sort of supermethod of the likes the world has not seen before*/
	public void clickClearInsightKeywordBox(){
		TxtBox_Keyword.click();
		TxtBox_Keyword.clear();
	}
	
	

}
