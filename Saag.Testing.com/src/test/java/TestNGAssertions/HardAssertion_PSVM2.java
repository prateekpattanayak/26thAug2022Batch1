package TestNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssertion_PSVM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		String actualTitle=driver.getTitle();
		
		String expectedTitle="Testing";
		
		
		Assert.assertEquals(actualTitle,expectedTitle,"Both are not same");
		
driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//driver.close();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
