package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {

	public HomePagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, xpath ="/html/body/div[3]/div/div[2]/div/div/div/div/div/div/div[1]/p")
	private WebElement bannerTab_FirstBannerTab;
	
	@FindBy(how = How.XPATH, xpath ="/html/body/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/p")
	private WebElement bannerTab_SecondBannerTab;
	
	
	public void first_Banner(String name){
		bannerTab_FirstBannerTab.click();
	}
	
	public void second_Banner(String name){
		bannerTab_SecondBannerTab.click();
	}

}
