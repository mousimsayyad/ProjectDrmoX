package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFrames {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1); 
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("123456789");
		
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("333333");
		
		//innerframe
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		
		driver.switchTo().defaultContent();
		
		//frame 2
		
		
		
		//frame 4
		
		
		
		//frame 5
		

	}

}
