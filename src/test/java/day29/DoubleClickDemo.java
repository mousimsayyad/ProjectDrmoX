package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); //switch to frame
		
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("Welcome");
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		//String copiedText= f2.getText(); //this will not work
		String copiedText= f2.getAttribute("value"); //this wil work
		System.out.println("CopiedText :"+copiedText);
		if(copiedText.equals("Welcome"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		

	}

}
