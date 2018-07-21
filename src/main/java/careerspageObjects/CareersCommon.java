package careerspageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import stepDefinitions.AbstractPageStepDefinition;

public class CareersCommon extends AbstractPageStepDefinition{
	public CareersCommon(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver = getDriver();
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers'][1]")
	private WebElement Title01;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/experienced-lawyers'][1]")
	private WebElement Title02;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/business-teams'][1]")
	private WebElement Title03;
	
	@FindBy(how = How.XPATH, xpath = "//button[@class='header__geoToggle']")
	private WebElement GeoToggle;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='header__geoToggle-list']/ul/li[1]/a")
	private WebElement GeoSelect01;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='header__geoToggle-list']/ul/li[2]/a")
	private WebElement GeoSelect02;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='header__geoToggle-list']/ul/li[3]/a")
	private WebElement GeoSelect03;

	@FindBy(how = How.XPATH, xpath = "//a[@class='header__brand']")
	private WebElement LlHomeButton;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/our-opportunities']")
	private WebElement EarlyCareersToMyOpportunities;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/our-people']")
	private WebElement EarlyCareersToOurPeople;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/meet-us']")
	private WebElement EarlyCareersToMeetUs;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/our-work']")
	private WebElement EarlyCareersToOurWork;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/your-career']")
	private WebElement EarlyCareersToYourCareer;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/your-application']")
	private WebElement EarlyCareersToYourApplication;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/our-deals']")
	private WebElement EarlyCareersToOurDeals;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/why-join']")
	private WebElement EarlyCareersToWhyJoin;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/who-we-are']")
	private WebElement EarlyCareersToWhoWeAre;
	
	@FindBy(how = How.XPATH, xpath = "//a[@href='/en/early-careers/commercial-awareness']")
	private WebElement EarlyCareersToCommercialAwareness;
	
	
	public void clickSecOurOpportunites(){
		EarlyCareersToMyOpportunities.click();
	}
	
	public void clickSecOurPeople(){
		EarlyCareersToOurPeople.click();
	}	
	
	public void clickSecMeetUs(){
		EarlyCareersToMeetUs.click();
	}
	
	public void clickSecOurWork(){
		EarlyCareersToOurWork.click();
	}
	
	public void clickSecYourCareer(){
		EarlyCareersToYourCareer.click();
	}
	
	public void clickSecYourApplication(){
		EarlyCareersToYourApplication.click();
	}
	
	public void clickSecOurDeals(){
		EarlyCareersToOurDeals.click();
	}
	
	public void clickSecWhyJoin(){
		EarlyCareersToWhyJoin.click();
	}
	
	public void clickSecWhoWeAre(){
		EarlyCareersToWhoWeAre.click();
	}
	
	public void clickSecCommercialAwareness(){
		EarlyCareersToCommercialAwareness.click();
	}
		
	public void clickTitle01(){
		Title01.click();
	}
	
	public void clickTitle02(){
		Title02.click();
	}
	
	public void clickTitle03(){
		Title03.click();
	}
	
	public void clickLlHomeButton(){
		LlHomeButton.click();
	}
	
	public void mouseHoverTitle01(){
		Actions action = new Actions(driver);	
		action.moveToElement(driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/early-careers']"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/en/early-careers/our-opportunities']")));
	}
		
	public void assertTitle01(){
		WebDriverWait  wait01 =new WebDriverWait(driver,5);
		wait01.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/en/early-careers"));
	}
	
	public void assertTitle02(){
		WebDriverWait  wait01 =new WebDriverWait(driver,5);
		wait01.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/en/experienced-lawyers"));
	}
	
	public void assertTitle03(){
		WebDriverWait  wait01 =new WebDriverWait(driver,5);
		wait01.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/en/business-teams"));
	}
	
	public void mouseOverGeoToggle(){
		Actions action = new Actions(driver);
		action.moveToElement(GeoToggle).click().build().perform();
	}
	
	public void clickOnGeoSel01(){
		Actions action = new Actions(driver);
		action.moveToElement(GeoSelect01).click().build().perform();
	}
	
	public void clickOnGeoSel02(){
		Actions action = new Actions(driver);
		action.moveToElement(GeoSelect02).click().build().perform();
	}
	
	public void clickOnGeoSel03(){
		Actions action = new Actions(driver);
		action.moveToElement(GeoSelect03).click().build().perform();
	}
	
	public void assertGeoSel01(){
		WebDriverWait  wait01 =new WebDriverWait(driver,5);
		wait01.until(ExpectedConditions.urlMatches("https://allenscareers.linklaters.com/"));
	}
	
	public void assertGeoSel02(){
		WebDriverWait  wait02 =new WebDriverWait(driver,5);
		wait02.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/fr-fr"));
	}
	
	public void assertGeoSel03(){
		WebDriverWait  wait03 =new WebDriverWait(driver,5);
		wait03.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/it-it"));
	}
	
	
	

}
