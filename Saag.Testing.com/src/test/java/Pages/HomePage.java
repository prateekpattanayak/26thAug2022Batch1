package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	@CacheLookup
	
	@FindBy(how=How.XPATH,using ="//p[contains(@class,'oxd-userdropdown-name')]")
	
	public WebElement PaulCollings_Button;
	
public void clickpaulCoolings() {
	
	PaulCollings_Button.click();
}
	
	
	
}
