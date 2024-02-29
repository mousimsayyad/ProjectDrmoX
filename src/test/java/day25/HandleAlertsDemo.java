package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//Alert alertwindow=driver.switchTo().alert();
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		String msg=alertwindow.getText();
		System.out.println(msg);
		//alertwindow.accept();// this will close alert window with ok button
		alertwindow.dismiss();//this will close alert window with cancel button
		
		
		

	}

}
