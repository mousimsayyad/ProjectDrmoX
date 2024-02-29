package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDropdownWithSelectTag {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select drpCountry = new Select(drpCountryEle);
		
		//Selectiong option from the dropdown
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("4"); //use this only if value attribute is present for option tag
		drpCountry.selectByIndex(3);
		
		//Find total options in dropdown
		List<WebElement> options=drpCountry.getOptions();
		System.out.println(options.size());
		
		//3 Print options in console window
		/*for(int i=0;i<options.size();i++) 
		{
			System.out.println(options.get(i).getText());
		}*/
		//using enhanced loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
	}

}
