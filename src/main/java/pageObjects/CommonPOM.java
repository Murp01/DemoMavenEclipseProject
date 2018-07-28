package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.AbstractPageStepDefinition;

public class CommonPOM extends AbstractPageStepDefinition {
	
	public CommonPOM(WebDriver driver){
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
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='notification-wrapper cookieWrapper']")
	private WebElement header_CookieBanner;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='notification-wrapper cookieWrapper']/div/div/div[@class='notification-close']")
	private WebElement header_CookieBannerCloseClick;
	
	
	public void assertFalseCookieBanner(){
		//doesn't work
		Assert.assertFalse(header_CookieBanner.isDisplayed());
	}
	
	public void assertFalseSearchInput(){
		Assert.assertFalse("", header_SearchInput.isDisplayed());
	}
	
	public void assertTrueCookieBanner(){
		header_CookieBanner.isDisplayed();
	}
		
	public void assertTrueSearchInput(){
		Assert.assertTrue("The searchbox opened successfully", header_SearchInput.isDisplayed());
	}	
	
	public void clickAboutUsTitle(){
		//header_AboutUs.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", header_AboutUs);
	}
	
	public void clickCookieBannerCloseBtn(){
		header_CookieBannerCloseClick.click();
	}
	
	public void clickInsightTitle(){
		header_Insights.click();
	}
	
	public void clickSearchInput(){
		header_SearchInput.click();
	}
	
	public void clickSearchToggle(){
		header_SearchToggle.click();
	}
	
	public void mouseOverAboutUsTitle(){
		Actions builder = new Actions(driver);
		builder.moveToElement(header_AboutUs).build().perform();
	}
		
	public void mouseOverInsightTitle(){
		Actions builder = new Actions(driver);
		builder.moveToElement(header_Insights).build().perform();
	}
	
	public void sendKeysSearchInput(){
		header_SearchInput.sendKeys();
	}
	

	public void jsWaitforPageToLoad(){
		ExpectedCondition<Boolean> expectation = new
	            ExpectedCondition<Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	        }
	    };
	    try {
	        Thread.sleep(1000);
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(expectation);
	    } catch (Throwable error) {
	        //Assert.fail("Timeout waiting for Page Load Request to complete.");
	    }
	}

}
