package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverExtensions {

	public WebDriver driver;
	
	public void launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver =new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\edgedriver_win64\\msedgedriver.exe");
			
			driver=new EdgeDriver();
			
		}
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
