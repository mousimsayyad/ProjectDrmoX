package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithInputBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		
		alertwindow.sendKeys("welcome");
		
		alertwindow.accept();
		//alertwindow.dismiss();
		//validation
		String act_val=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_val= "You entered: welcome";
		System.out.println(act_val);
		System.out.println(exp_val);
		if(act_val.equals(exp_val)) 
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
	}
}