package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplitcitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit command
		
		//declaring explicit wait
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement userLogin=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		userLogin.sendKeys("Admin");
		WebElement paswd=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		paswd.sendKeys("admin123");
	}

}

