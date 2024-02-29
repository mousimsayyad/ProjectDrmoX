package day26;

import org.openqa.selenium.WebDriver;

public class HandlesFramesDemo1 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/html/index.htm");
		driver.manage().window().maximize();

	}

}
