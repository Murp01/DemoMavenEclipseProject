package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Common {
	
	public Common(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, xpath ="/html/body/header/div/div/div/ul/li[6]/a")
	private WebElement header_Insights;
	
	public void insightTitleClick(){
		header_Insights.click();
	}
	

}
