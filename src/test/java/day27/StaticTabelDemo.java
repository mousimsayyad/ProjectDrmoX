package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTabelDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//1.find total number of rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //preferred
		//int rows=driver.findElements(By.tagName("tr")).size();    //if u habve asingle table
		System.out.println("No of rows: "+rows);
		
		//2.find total number of columns
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//driver.findElements(By.tagName("th"));  //dont prefer if u have multiple tables
		System.out.println("no of cols: "+cols);
		
		//3.Read specific row and column data
		String ele=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[4]")).getText();
		System.out.println(ele);
		
		//4.Read data from all rows & columns 
		System.out.println("Book Name"+"        "+"Author"+"        "+"Subject"+"         "+"Price");
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String val=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(val+"\t"+"    ");
			}
			System.out.println();
		}
		
		//5.print books name written by amit
		for(int r=2;r<=rows;r++)
		{
			String authname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authname.equals("Amit")) 
			{
				String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(authname+"  "+book);
			}
			
		}
		
		//6.find sum of all book prices
		int sum=0;
		for(int r=2; r<=rows;r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			sum += Integer.parseInt(price);
		}
		System.out.println(sum);
	}

}
