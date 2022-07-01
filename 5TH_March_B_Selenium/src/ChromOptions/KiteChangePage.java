package ChromOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteChangePage 
{
	//1. Data Members
	
		@FindBy (xpath = "//a[text()='Change user']") private WebElement ChangeUser;
	
	//2. Constructor
	
		public KiteChangePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			
	//3. Methods
		
		public void ClickOnChangeUser()
		{
			ChangeUser.click();
		}
}
