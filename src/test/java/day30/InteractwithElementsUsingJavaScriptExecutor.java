package day30;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractwithElementsUsingJavaScriptExecutor {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.switchTo().frame(0);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//JavascriptExecutor js =driver;
		
		//firstname
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
		
		
		//Radio button
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='male']"));
		//male_rd.click();   //clickInterceptedException
		js.executeScript("arguments[0].click();", male_rd);
		
		//checkbox
		WebElement check=driver.findElement(By.xpath("//input[@id='monday']"));
		//check.click();
		js.executeScript("arguments[0].click();", check);

	}

}
