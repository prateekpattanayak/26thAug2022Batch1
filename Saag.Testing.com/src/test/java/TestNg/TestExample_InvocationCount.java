package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExample_InvocationCount extends DriverExtensions {
	
	@BeforeSuite
	public void launchBrowser() {

		System.out.println("I am in @BeforeSuite method ");

		launchBrowser("Chrome");

	}

	@BeforeTest
	public void launchURL() {

		System.out.println("I am in @BeforeTest method ");

		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@BeforeClass
	public void maximizeBrowser() {
		System.out.println("I am in @BeforeClass method ");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}
	

	@Test(invocationCount=10)
	
	public void enterTextIntoField1() {
		
driver.findElement(By.id("field1")).clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.id("field1")).sendKeys("Testing");
		
	}

	@AfterSuite
	public void closeBrowser() {

		System.out.println("I am in @AfterSuite method ");

		driver.close();

	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
