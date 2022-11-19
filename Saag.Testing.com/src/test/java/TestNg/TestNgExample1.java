package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExample1 {

	@Test
	public void verify() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=2198883737963396524&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007799&hvtargid=kwd-298741529014&hydadcr=5903_2362026&gclid=CjwKCAjws--ZBhAXEiwAv-RNL8O6nqbyoqTM4zHpLOls9nXxSiE4lFzO8RSRFqH_6TJ8Y0Qe232NQhoCk5kQAvD_BwE");
		
		
	}
	
	
	
	
	
	
	
	
}
