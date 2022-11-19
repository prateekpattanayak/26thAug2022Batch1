package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample2 {

	public WebDriver driver;
	
	@BeforeSuite
	
	public void launchBrowser() {
		
		System.out.println("I am in @BeforeSuite method ");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\26thAug022Batch\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
	}
	
	
	@BeforeTest
	
	public void launchURL() {
		
		System.out.println("I am in @BeforeTest method ");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	
	@BeforeClass
	
	public void maximizeBrowser() {
	
	System.out.println("I am in @BeforeClass method");
	
	driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	}
	
	@Test(priority=0)
	
	public void enterUsername() {
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	}
	
	@Test(priority=1)
	
	public void enterPassword() {
	
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	}
	
	@Test(priority=2)
	
	public void ClickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
	}
	
	
	@AfterSuite
	
	public void closeBrowser() {
		
		System.out.println("I am in @AfterSuite method");
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

