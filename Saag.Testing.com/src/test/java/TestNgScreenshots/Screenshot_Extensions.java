package TestNgScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot_Extensions {

	public WebDriver driver;
	
	public void takeScreenshot(String screenshotName) throws IOException {
	
	File screenShot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenShot,new File("C:\\Users\\prate\\eclipse-workspace\\Saag.Testing.com\\src\\test\\java\\ScreenshotImages\\"+screenshotName ));
	
	
	
	
}
}