package day31;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {


		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//capture full page screenshot   selenium 3 and 4
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\SeleniumJavaEclipse\\WebDriveMavenProject\\Screenshots\\fullpage.png");
		
		FileHandler.copy(src, trg);
		*/
		
		//capture screenshot of specific area of from webpage----selenium 4
	
		
		WebElement fproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=fproducts.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\\\SeleniumJavaEclipse\\\\WebDriveMavenProject\\\\Screenshots\\\\featureproducts.png");
		FileHandler.copy(src, trg);

	}

}
