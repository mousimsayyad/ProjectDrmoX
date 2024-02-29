package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticatedPopupOrAlert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//https://the-internet.herokuapp.com/basic_auth
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
			
		
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
	
		String ele=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(ele.contains("Congratulations!")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
}
}