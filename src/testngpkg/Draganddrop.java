package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement From=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(From, To).perform();
		
		WebElement From1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement To1=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]"));
	//	Actions actions = new Actions(driver);
		action.dragAndDrop(From1, To1).perform();
		
		WebElement From11=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement To11=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		action.dragAndDrop(From11, To11).perform();
		
		
		WebElement From111=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement To111=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		action.dragAndDrop(From111, To111).perform();
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		ele.getText();
		if(ele.getText().equals("Perfect!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
	}

}
