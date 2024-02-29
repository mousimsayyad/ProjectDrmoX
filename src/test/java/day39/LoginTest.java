package day39;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	//LoginPage lp;
	LoginPage2 lp;
	@BeforeClass
	void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test(priority=1)
	void testLogo() 
	{
		//lp=new LoginPage(driver);
		lp=new LoginPage2(driver);
		//Thread.sleep(3000);
		Assert.assertEquals(lp.checkLogoPresence(), true);
	}
	
	
	@Test(priority=2)
	void Testlogin()
	{
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	@AfterClass
	void tearDown() 
	{
		driver.quit();
	}
	
}
