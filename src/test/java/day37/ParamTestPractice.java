package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParamTestPractice {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setUpTest(String br) {
		
		if(br.equals("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if(br.equals("edge")) {
			driver= new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	void logoTest()
	{
		try {
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
	@Test(priority=2)
	void titleTest()
	{
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store", "titles are not matched");
	}
	@AfterClass
	void closeApptest()
	{
		driver.quit();
	}
}
