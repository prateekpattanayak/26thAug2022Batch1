package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstProgramInSelenium_edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//edge driver extension
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\edgedriver_win64\\msedgedriver.exe");
		
		
		//edge driver launch
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=2198883737963396524&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007799&hvtargid=kwd-298741529014&hydadcr=5903_2362026&gclid=CjwKCAjws--ZBhAXEiwAv-RNL8O6nqbyoqTM4zHpLOls9nXxSiE4lFzO8RSRFqH_6TJ8Y0Qe232NQhoCk5kQAvD_BwE");
		
	}

}

