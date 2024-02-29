package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		if(br.equals("chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else if(br.equals("edge")) {
			driver= new EdgeDriver();
		}
		
		else {
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	void testLogo()
	{
		try {
		boolean status=driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).isDisplayed();
		Assert.assertEquals(status, true);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
	@Test(priority=2)
	void testHomepageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OpenCart - Demo","Titles are not mactched");
	}
	
	@AfterClass
	void closeApp()
	{
		driver.quit();
		
	}
}
