package careerspageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class CareersMeetUs extends AbstractPageStepDefinition{
	public CareersMeetUs (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
		
	@FindBy(how = How.XPATH, xpath = "//div[@class='search__sidebar']")
	private WebElement MeetUsSearchSidebar;
	
	@FindBy(how = How.XPATH, xpath = "//input[@class='string-search']")
	private WebElement MeetUsKeywordSearchBox;
	
	@FindBy(how = How.XPATH, xpath = "//button[@title='Location']")
	private WebElement MeetUsLocationDropDown;
	
	@FindBy(how = How.XPATH, xpath = "//button[@title='Sort by']")
	private WebElement MeetUsSortByDropDown;
	
	@FindBy(how = How.XPATH, xpath = "//a[@class='listCta__link listCta__link--tall listCta__link--white scrollTop']")
	private WebElement MeetUsEditSearchButton;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='col-xs-12']")
	private WebElement MeetUsEventSearchResultPane;
	
	@FindBy(how = How.XPATH, xpath = "//span[contains(text(),'Sort A-Z')]")
	private WebElement MeetUsSortAZDropDown;
	
	@FindBy(how = How.XPATH, xpath = "//span[contains(text(),'Sort Z-A')]")
	private WebElement MeetUsSortZADropDown;
	
	
	
	public void clickKeywordSearchTerm(){
			MeetUsKeywordSearchBox.click();
	}
	
	public void enterTextIntoKeywordSearch(String keyword){
		driver.findElement(By.xpath("//input[@class='string-search']")).sendKeys(keyword);
	}	
	
	public void clickSortByAsc(){
		MeetUsSortByDropDown.click();
		MeetUsSortAZDropDown.click();
	}
	
	public void clickSortByDesc(){
		MeetUsSortByDropDown.click();
		MeetUsSortZADropDown.click();
	}
	
	
	
	public void SearchForAnEventInKeywordSearch(){
		//ClickKeywordSearchTerm;
		//EnterTextIntoKeywordSearch;
		
	}

}
