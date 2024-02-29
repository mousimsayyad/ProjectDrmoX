package day30;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opencart.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB);  //opens new TAB
		
		driver.switchTo().newWindow(WindowType.WINDOW);  //opens new WINDOW
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		

	}

}
