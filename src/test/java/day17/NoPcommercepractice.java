package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoPcommercepractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement txtinput=driver.findElement(By.className("email"));
		txtinput.clear();
		txtinput.sendKeys("admin@yourstore.com");
		WebElement pswd=driver.findElement(By.className("password"));
		pswd.clear();
		pswd.sendKeys("admi1n");
		
		driver.findElement(By.xpath("//button[contains(@class, 'button-1')]")).click();
		
		String exp_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		//System.out.println(act_title);
		if(act_title.equals(exp_title))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("test failed");
		}
	}

}
