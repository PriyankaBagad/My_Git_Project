package KiteAppPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	//1. Data member/Variable
	
	@FindBy (id="pin") private WebElement PIN;
	@FindBy (xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//2. Constructor
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Method
	
	public void sendPin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickOnContinueButton()
	{
		ContinueButton.click();
	}
	
}
