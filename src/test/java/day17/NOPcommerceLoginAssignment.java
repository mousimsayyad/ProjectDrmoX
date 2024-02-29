package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPcommerceLoginAssignment {

	public static void main(String[] args) {
		
		//1 launch browser
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//2.providing username
		WebElement inputbox=driver.findElement(By.name("Email"));
		inputbox.clear();
		inputbox.sendKeys("admin@yourstore.com");
		
		//3.providing password
		WebElement pswd=driver.findElement(By.id("Password"));
		pswd.clear();
		pswd.sendKeys("admin");
		
		
		//4.login
		driver.findElement(By.className("button-1")).click();
		
		String act_title= driver.getTitle();
		String exp_title="Dashboard / nopCommerce administration";
		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		

	}

}
