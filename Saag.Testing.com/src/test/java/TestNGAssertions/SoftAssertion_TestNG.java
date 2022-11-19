package TestNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNg.DriverExtensions;

public class SoftAssertion_TestNG extends DriverExtensions {

		@BeforeSuite
		public void launchBrowser() {

			System.out.println("I am in @BeforeSuite method ");

			launchBrowser("chrome");

		}

		@BeforeTest
		public void launchURL() {

			System.out.println("I am in @BeforeTest method ");

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

		@BeforeClass
		public void maximizeBrowser() {
			System.out.println("I am in @BeforeClass method ");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		}

		@Test(priority = 0)
		public void enterUsername() {

			SoftAssert softass=new SoftAssert();
			
			String actualTitle = driver.getTitle();

			String expectedTitle = "OrangeHRM";

			softass.assertEquals(actualTitle, expectedTitle);

			driver.findElement(By.name("username")).sendKeys("Admin");
			
			softass.assertAll();

		}

		@Test(priority = 1)
		public void enterPassword() {

			driver.findElement(By.name("password")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		
		@Test(priority = 2)
		public void signout() {

			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		}


		@AfterSuite
		public void closeBrowser() {

			System.out.println("I am in @AfterSuite method ");

			//driver.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
}
