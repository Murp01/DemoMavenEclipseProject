package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InsightsPage {
	
	public InsightsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(how = How.XPATH, xpath ="/html/body/div[4]/div/div/div[1]/div/div[1]/div[1]/input")
	private WebElement TxtBox_Keyword;

	
	
	public void insight_KeywordEnterText(String keyword){
		TxtBox_Keyword.sendKeys(keyword);
	}
	
	public void insight_KeywordClearText(){
		TxtBox_Keyword.clear();
	}
	
	public void insight_KeywordClick(){
		TxtBox_Keyword.click();
	}
	
	

}
