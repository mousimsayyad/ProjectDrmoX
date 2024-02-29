package day34;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThirdTest 
{
	WebDriver driver;
	
	@Test(priority=1)
	void openapp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.nopcommerce.com/");
	}
	@Test(priority=2)
	void login()
	{
		//title validation
		String act_title=driver.getTitle();
		String exp_title="nopCommerce demo store";
		if(act_title.equals(exp_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}
	
	@Test(priority=3)
	void logout()
	{
		driver.close();
	}
}
