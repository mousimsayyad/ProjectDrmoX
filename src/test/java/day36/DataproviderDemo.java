package day36;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataproviderDemo {
	
	WebDriver driver;
	@BeforeClass
	void setup(){
		driver=new ChromeDriver();
		
	}
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("email")).sendKeys(email);
		driver.findElement(By.className("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")
	String [][] loginData(){
			String arr[][]= {
					{"mousinsayed@gmail.com", "test@123"},
					{"mousinsayed@gmail.com", "test@12"},
					{"mousinsayed@gmail.com", "test@13"}	
			};
			return arr;
	}
}
