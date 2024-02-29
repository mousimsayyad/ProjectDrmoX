package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current location of min Slider Before moving: "+min_slider.getLocation()); //(59,250)(x,y)

		act.dragAndDropBy(min_slider, 100, 250).perform();
		
		System.out.println("Current location of minSlider After moving: "+min_slider.getLocation()); //(59,250)(x,y)
		
		//max slider
		WebElement max_slider=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/span[2]"));
		System.out.println("max_slider current Location:"+max_slider.getLocation());   //(510,249) (x,y)
		
		act.dragAndDropBy(max_slider, -90, 250).perform();
		System.out.println("max_slider current Location After slider :"+max_slider.getLocation());  //(419, 249) (x,y)
		
	}

}
