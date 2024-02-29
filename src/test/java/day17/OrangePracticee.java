package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangePracticee {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin23");
		
		driver.findElement(By.xpath("//button[contains(@class, 'oxd-button')]")).click();
		
		/*String exp_title="OrangeHRM";
		
		String act_title=driver.getTitle();
		if(act_title.equals(exp_title))
		{
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		*/
		
		String act_label=null;
		String exp_label="Dashboard";
		try 
		{
			act_label=driver.findElement(By.xpath("//h6[contains(@class, 'oxd-text')]")).getText();
		}
		
		catch(Exception e)
		{
			act_label="";
		}
		
		if(act_label.equals(exp_label))
		{
			System.out.println("test passed");
		}
		
		else {
			System.out.println("test failed");
		}
		
		driver.quit();

	}

}
