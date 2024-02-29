package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationofElements {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		driver.manage().window().maximize();
		System.out.println("After maximizing windlow logo current location :"+logo.getLocation());
		driver.manage().window().minimize();
		System.out.println("After minimizing windlow logo current location :"+logo.getLocation());
		driver.manage().window().fullscreen();
		System.out.println("After full screen windlow logo current location :"+logo.getLocation());
		
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println("After setting windlow 100/100 logo current location :"+logo.getLocation());
		
		
		p=new Point(50,50);
		driver.manage().window().setPosition(p);
		System.out.println("After setting windlow 100/100 logo current location :"+logo.getLocation());
	}

}
