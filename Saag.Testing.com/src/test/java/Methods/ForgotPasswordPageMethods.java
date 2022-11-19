package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPassword;

public class ForgotPasswordPageMethods {

	WebDriver driver;
	
	ForgotPassword fp =new ForgotPassword(driver);
	

	public ForgotPasswordPageMethods(WebDriver driver) 
	
	{
		this.driver=driver;
	}

	public void enterUsername() {
		
		driver.findElement(fp.username_Textbox_ResetPassword).sendKeys("Admin");
	}
	
	public void clickCancel() {
		
		driver.findElement(fp.Cancel_Button).click();
	}
	
	
	public void resetPassword() {
		
		driver.findElement(fp.ResetPassword_Button).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
